package kortools

import com.google.ortools.Loader
import com.google.ortools.linearsolver.MPConstraint
import com.google.ortools.linearsolver.MPObjective
import com.google.ortools.linearsolver.MPSolver
import com.google.ortools.linearsolver.MPVariable
import kotlin.reflect.KProperty

private val libsLoaded by lazy {
    Loader.loadNativeLibraries()
}

fun createSolver(solverId: SolverId, solverBuilder: MPSolver.() -> Unit = { }): MPSolver {
    libsLoaded

    val solver = MPSolver.createSolver(solverId.toString())

    solverBuilder(solver)

    return solver
}

enum class SolverId {
    CLP_LINEAR_PROGRAMMING,
    CLP,
    CBC_MIXED_INTEGER_PROGRAMMING,
    CBC,
    GLOP_LINEAR_PROGRAMMING,
    GLOP,
    BOP_INTEGER_PROGRAMMING,
    BOP,
    SAT_INTEGER_PROGRAMMING,
    SAT,
    CP_SAT,
    SCIP_MIXED_INTEGER_PROGRAMMING,
    SCIP,
    GUROBI_LINEAR_PROGRAMMING,
    GUROBI_LP,
    GUROBI_MIXED_INTEGER_PROGRAMMING,
    GUROBI,
    GUROBI_MIP,
    CPLEX_LINEAR_PROGRAMMING,
    CPLEX_LP,
    CPLEX_MIXED_INTEGER_PROGRAMMING,
    CPLEX,
    CPLEX_MIP,
    XPRESS_LINEAR_PROGRAMMING,
    XPRESS_LP,
    XPRESS_MIXED_INTEGER_PROGRAMMING,
    XPRESS,
    XPRESS_MIP,
    GLPK_LINEAR_PROGRAMMING,
    GLPK_LP,
    GLPK_MIXED_INTEGER_PROGRAMMING,
    GLPK,
    GLPK_MIP
}

class MPVariableDelegate(val lb: Double, val ub: Double, val mpSolver: MPSolver) {
    var isIntialized = false
    lateinit var variable: MPVariable
//    operator fun setValue(thisRef: Nothing?, property: KProperty<*>, value: String) {
//        println("$value has been assigned to '${property.name}' in $thisRef.")
//    }

    operator fun getValue(nothing: Nothing?, property: KProperty<*>): MPVariable {
        if(!isIntialized) {
            isIntialized = true
            variable = mpSolver.makeNumVar(lb, ub, property.name)
        }

        return variable
    }
}

fun MPSolver.makeVariable(lb: Double, ub: Double): MPVariableDelegate {
    return MPVariableDelegate(lb, ub, this)
}

//operator fun MPConstraint.as
class ConstraintBuilder(val mpSolver: MPSolver, val ct: MPConstraint) {


    infix fun MPVariable.withCoeff(d: Double) {
        ct.setCoefficient(this, d)
    }
}

fun MPSolver.constraint(
    name: String,
    range: Pair<Double, Double>,
    builder: ConstraintBuilder.() -> Unit,
): MPConstraint {
    val ct = makeConstraint(range.first, range.second, name)
//    ct.setCoefficient(x, 1.0)
//    ct.setCoefficient(y, 1.0)

    builder(ConstraintBuilder(this, ct))

    return ct
}

class ObjectiveBuilder {
//    fun build()

    operator fun Number.times(x: MPVariable): List<Pair<MPVariable, Number>> {
        this
        x
        return listOf(x to this)
    }


    operator fun MPVariable.plus(x: MPVariable): List<Pair<MPVariable, Number>> {
        this
        x
        return listOf(this to 1, x to 1)
    }

    operator fun List<Pair<MPVariable, Number>>.plus(x: MPVariable): List<Pair<MPVariable, Number>> {
        x
        return this.plus(x to 1)
    }
}

fun MPSolver.maximize(builder: ObjectiveBuilder.() -> List<Pair<MPVariable, Number>>): MPObjective {
    val expression: List<Pair<MPVariable, Number>> = builder(ObjectiveBuilder())

    return objective().apply {
        expression.forEach { (mpvar, coeff) ->
            setCoefficient(mpvar, coeff.toDouble())
        }

        setMaximization()
    }

}

fun MPSolver.variable(name: String): MPVariable = variables().find { it.name() == name }!!

