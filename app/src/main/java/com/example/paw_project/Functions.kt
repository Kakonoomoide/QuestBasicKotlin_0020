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

fun main(){

}