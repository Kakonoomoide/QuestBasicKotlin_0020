package com.example.paw_project

// Function withoutParameter
// - Prints a greeting message without requiring any input parameters.
fun withoutParameter() {
    println("== withoutParameter ==")
    println("Hello, World!")
}

// Function withParameter
// - Prints a personalized greeting message.
fun withParameter(name: String) {
    println()
    println("== withParameter ==")
    println("Hello, $name!")
}

// Function withNamedArgument
// - This function allows for clear, descriptive usage when called with named arguments.
fun withNamedArgument(name: String, age: Int) {
    println()
    println("== withNamedArgument ==")
    println("Hello, $name! You are $age years old.")
}

// Function withDefaultArgument
// - If `name` is not provided when the function is called, it defaults to "people".
fun withDefaultArgument(name: String = "people", age: Int) {
    println()
    println("== withDefaultArgument ==")
    println("Hello, $name! You are $age years old.")
}

// Function withReturn
// - Calculates the area of a rectangle given its length (panjang) and width (lebar).
fun withReturn(panjang: Int, lebar: Int): Int {
    println()
    println("== withReturn ==")
    return panjang * lebar
}

fun main(){
    // Calling the function without parameters
    withoutParameter()

    // Calling the function with a parameter
    withParameter("Rizki")

    // Calling the function with named arguments
    withNamedArgument(name = "kakonoomoide", age = 30)

    // Calling the function with a default argument
    withDefaultArgument(age = 25)

    // Calling a function that returns a value
    println(withReturn(panjang = 9, lebar = 2))
}