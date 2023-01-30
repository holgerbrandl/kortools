// The Stigler diet problem.
package examples.stiglerdiet

import com.google.ortools.Loader
import com.google.ortools.linearsolver.MPSolver.ResultStatus
import kortools.SolverId
import kotlin.system.exitProcess

/** Stigler diet example.  */
fun main() {
    Loader.loadNativeLibraries()

    // Nutrient minimums.
    val nutrients: MutableList<Array<Any>> = ArrayList()
    nutrients.add(arrayOf("Calories (kcal)", 3.0))
    nutrients.add(arrayOf("Protein (g)", 70.0))
    nutrients.add(arrayOf("Calcium (g)", 0.8))
    nutrients.add(arrayOf("Iron (mg)", 12.0))
    nutrients.add(arrayOf("Vitamin A (kIU)", 5.0))
    nutrients.add(arrayOf("Vitamin B1 (mg)", 1.8))
    nutrients.add(arrayOf("Vitamin B2 (mg)", 2.7))
    nutrients.add(arrayOf("Niacin (mg)", 18.0))
    nutrients.add(arrayOf("Vitamin C (mg)", 75.0))

    val goods: MutableList<Array<Any>> = nutritionData()


    // Create the linear solver with the GLOP backend.
    val solver = kortools.createSolver(SolverId.GLOP) {
        val foods = goods.mapIndexed { idx, record ->
            makeNumVar(0.0, Double.POSITIVE_INFINITY, goods[idx][0] as String)
        }

        nutrients.forEachIndexed { idx, nutrient ->
            val constraint = makeConstraint(
                nutrient[1] as Double, Double.POSITIVE_INFINITY, nutrient[0] as String
            )
            for(j in goods.indices) {
                constraint.setCoefficient(foods[j], (goods[j][3] as DoubleArray)[idx])
            }
        }

        println("Number of variables = " + numVariables())
        println("Number of constraints = " + numConstraints())

        objective().apply {
            foods.forEach { setCoefficient(it, 1.0) }
            setMinimization()
        }

        val resultStatus = solve()

        // Check that the problem has an optimal solution.
        if(resultStatus != ResultStatus.OPTIMAL) {
            System.err.println("The problem does not have an optimal solution!")

            if(resultStatus == ResultStatus.FEASIBLE) {
                System.err.println("A potentially suboptimal solution was found.")
            } else {
                System.err.println("The solver could not solve the problem.")
                exitProcess(-1)
            }
        }

        // Display the amounts (in dollars) to purchase of each food.
        val nutrientsResult = DoubleArray(nutrients.size)

        println("\nAnnual Foods:")
        for(i in foods.indices) {
            if(foods[i].solutionValue() > 0.0) {
                println(goods[i][0] as String + ": $" + 365 * foods[i].solutionValue())
                for(j in nutrients.indices) {
                    nutrientsResult[j] += (goods[i][3] as DoubleArray)[j] * foods[i].solutionValue()
                }
            }
        }
        println(""" Optimal annual price: ${"$"}${365 * objective().value()}""")
        println("\nNutrients per day:")
        for(i in nutrients.indices) {
            println(nutrients[i][0].toString() + ": " + nutrientsResult[i] + " (min " + nutrients[i][1] + ")")
        }

        println("\nAdvanced usage:")
        println("Problem solved in " + wallTime() + " milliseconds")
        println("Problem solved in " + iterations() + " iterations")
    }
}

