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

import kortools.*

/** Minimal Linear Programming example to showcase calling the solver.  */
fun main() {

    // Create the linear solver with the GLOP backend.
    val solver = createSolver(SolverId.GLOP) {
        // Create the variables x and y.
        val x by makeVariable(0.0, 1.0)
        val y by makeVariable(0.0, 1.0)

        // Create a linear constraint, 0 <= x + y <= 2.
        constraint("ct", 0.0 to 2.0) {
            x withCoeff 1.0
            y withCoeff 1.0
        }

        // Create the objective function, 3 * x + y.
        maximize {
            3 * x + y
        }
    }

    // solve the problem
    solver.solve()

    with(solver) {
        println("Solution:")
        println("Number of variables = " + numVariables())
        println("Number of constraints = " + numConstraints())
        println("Objective value = " + objective().value())
        println("x = " + variable("x").solutionValue())
        println(
            "y = " + variable("y").solutionValue()
        )
    }
}
