# kortools

A kotlin API around [OR Tools](https://developers.google.com/optimization) 

[ ![Download](https://img.shields.io/github/v/release/holgerbrandl/kortools) ](https://github.com/holgerbrandl/kortools/releases) [![Build Status](https://github.com/holgerbrandl/kortools/workflows/build/badge.svg)](https://github.com/holgerbrandl/kortools/actions?query=workflow%3Abuild) [![slack](https://img.shields.io/badge/slack-datascience-yellowgreen)](https://kotlinlang.slack.com/messages/datascience/)

`kortools` provides a more natural API to express optimization problems on the JVM with the great OR as solver backend.

`kortools` is designed for simulation practitioners, process analysts and industrial engineers, who need to go beyond the limitations of existing simulation tools to model and optimize their business-critical use-cases.

## Example

```kotlin
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
```


## Jupyter

An easy way to get started with `kortools` is with jupyter, you simply need to install the [kotlin-jupyter](https://github.com/Kotlin/kotlin-jupyter) kernel and load the library with:

```bash
%use kortools
```

See [here](misc/optimize_cvrp.ipynb) for a notebook example.

## Setup

Add the following artifact to your `gradle.build`

```
compile "com.github.holgerbrandl:kortools:0.5"
```

You can also use [JitPack with Maven or Gradle](https://jitpack.io/#holgerbrandl/kortools/-SNAPSHOT) to build the latest snapshot as a dependency in your project.

```groovy
repositories {
    maven { url 'https://jitpack.io' }
}
dependencies {
        compile 'com.github.holgerbrandl:kortools:-SNAPSHOT'
}
```

To build and install it into your local maven cache, simply clone the repo and run
```bash
./gradlew install
```

## Misc References


https://github.com/google/or-tools/tree/stable/ortools/linear_solver/samples