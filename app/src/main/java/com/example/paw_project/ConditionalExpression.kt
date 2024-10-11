package com.example.paw_project

fun ConditionalStatement(){
    println("==== Conditional Expression ====")

    // If-Else Statement
    // - Checks if the variable `number` is greater than 0.
    // - If true, prints "Positive Number"; otherwise, prints "Negative Number".
    val number = 10
    if (number > 0) {
        println("Positive Number")
    } else {
        println("Negative Number")
    }

    // When Statement
    // - Evaluates the variable `day` to determine the corresponding day of the week.
    // - Prints the name of the day for values 1 to 7.
    // - If the value is outside this range, prints "Invalid Day".
    val day = 4
    when (day) {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> println("Invalid Day")
    }

    // Try-Catch Statement
    // - Attempts to convert the string `value` to an integer.
    // - catches the exception and prints "Invalid Number".
    val value = "10"
    try {
        val result = value.toInt()
        println("Result: $result")
    } catch (e: NumberFormatException) {
        println("Invalid Number")
    }
}

fun looping(){
    println()
    println("==== Looping ====")

    // For Loop: Range
    // - Iterates from 1 to 5, printing the current iteration number.
    for (i in 1..5) {
        println("Perulangan ke-$i")
    }

    // For Loop: List
    // - Iterates over the list of car brands, printing each car type.
    val cars = listOf("BMW", "Toyota", "Honda", "Audi")
    for (car in cars) {
        println("Car type: $car")
    }

    // While Loop
    // - Continuously executes as long as `x` is less than or equal to 5.
    // - Prints the current iteration number and increments `x`.
    var x = 1
    while (x <= 5) {
        println("Perulangan ke-$x")
        x++
    }

    // Do-While Loop
    // - Executes the loop body at least once, then continues while `y` is less than or equal to 5.
    // - Prints the current iteration number and increments `y`.
    var y = 1
    do {
        println("Perulangan ke-$y")
        y++
    } while (y <= 5)

}

fun main(){
    //ConditionalStatement()
    looping()
}