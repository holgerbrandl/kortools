// Copyright 2010-2022 Google LLC
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
// Minimal example to call the GLOP solver.
// [START program]
package examples

import com.google.ortools.Loader
import com.google.ortools.linearsolver.MPSolver

// [START import]
// [END import]
/** Minimal Linear Programming example to showcase calling the solver.  */
object BasicExample {
    @JvmStatic
    fun main(args: Array<String>) {
        // [START loader]
        Loader.loadNativeLibraries()
        // [END loader]

        // [START solver]
        // Create the linear solver with the GLOP backend.
        val solver = MPSolver.createSolver("GLOP")
        // [END solver]

        // [START variables]
        // Create the variables x and y.
        val x = solver.makeNumVar(0.0, 1.0, "x")
        val y = solver.makeNumVar(0.0, 2.0, "y")
        println("Number of variables = " + solver.numVariables())
        // [END variables]

        // [START constraints]
        // Create a linear constraint, 0 <= x + y <= 2.
        val ct = solver.makeConstraint(0.0, 2.0, "ct")
        ct.setCoefficient(x, 1.0)
        ct.setCoefficient(y, 1.0)
        println("Number of constraints = " + solver.numConstraints())
        // [END constraints]

        // [START objective]
        // Create the objective function, 3 * x + y.
        val objective = solver.objective()
        objective.setCoefficient(x, 3.0)
        objective.setCoefficient(y, 1.0)
        objective.setMaximization()
        // [END objective]

        // [START solve]
        solver.solve()
        // [END solve]

        // [START print_solution]
        println("Solution:")
        println("Objective value = " + objective.value())
        println("x = " + x.solutionValue())
        println("y = " + y.solutionValue())
        // [END print_solution]
    }
}