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
// [START program]
package examples

import com.google.ortools.Loader
import com.google.ortools.linearsolver.MPSolver
import com.google.ortools.linearsolver.MPSolver.ResultStatus
import com.google.ortools.linearsolver.MPVariable

// [START import]
// [END import]
/** MIP example that solves an assignment problem.  */
object AssignmentMip {
    @JvmStatic
    fun main(args: Array<String>) {
        Loader.loadNativeLibraries()

        // Data
        // [START data_model]
        val costs = arrayOf(
            doubleArrayOf(90.0, 80.0, 75.0, 70.0),
            doubleArrayOf(35.0, 85.0, 55.0, 65.0),
            doubleArrayOf(125.0, 95.0, 90.0, 95.0),
            doubleArrayOf(45.0, 110.0, 95.0, 115.0),
            doubleArrayOf(50.0, 100.0, 90.0, 100.0)
        )

        val numWorkers = costs.size
        val numTasks = costs[0].size
        // [END data_model]

        // Solver
        // [START solver]
        // Create the linear solver with the SCIP backend.
        val solver = MPSolver.createSolver("SCIP")
        if(solver == null) {
            println("Could not create solver SCIP")
            return
        }
        // [END solver]

        // Variables
        // [START variables]
        // x[i][j] is an array of 0-1 variables, which will be 1
        // if worker i is assigned to task j.
        val x = Array(numWorkers) { arrayOfNulls<MPVariable>(numTasks) }

        for(i in 0 until numWorkers) {
            for(j in 0 until numTasks) {
                x[i][j] = solver.makeIntVar(0.0, 1.0, "")
            }
        }
        // [END variables]

        // Constraints
        // [START constraints]
        // Each worker is assigned to at most one task.
        for(i in 0 until numWorkers) {
            val constraint = solver.makeConstraint(0.0, 1.0, "")
            for(j in 0 until numTasks) {
                constraint.setCoefficient(x[i][j], 1.0)
            }
        }
        // Each task is assigned to exactly one worker.
        for(j in 0 until numTasks) {
            val constraint = solver.makeConstraint(1.0, 1.0, "")
            for(i in 0 until numWorkers) {
                constraint.setCoefficient(x[i][j], 1.0)
            }
        }
        // [END constraints]

        // Objective
        // [START objective]
        val objective = solver.objective()
        for(i in 0 until numWorkers) {
            for(j in 0 until numTasks) {
                objective.setCoefficient(x[i][j], costs[i][j])
            }
        }
        objective.setMinimization()
        // [END objective]

        // Solve
        // [START solve]
        val resultStatus = solver.solve()
        // [END solve]

        // Print solution.
        // [START print_solution]
        // Check that the problem has a feasible solution.
        if(resultStatus == ResultStatus.OPTIMAL
            || resultStatus == ResultStatus.FEASIBLE
        ) {
            println(""" Total cost: ${objective.value()} """.trimIndent())

            for(i in 0 until numWorkers) {
                for(j in 0 until numTasks) {
                    // Test if x[i][j] is 0 or 1 (with tolerance for floating point
                    // arithmetic).
                    if(x[i][j]!!
                            .solutionValue() > 0.5
                    ) {
                        println("Worker " + i + " assigned to task " + j + ".  Cost = " + costs[i][j]) }
                }
            }
        } else {
            System.err.println("No solution found.")
        }
        // [END print_solution]
    }
}