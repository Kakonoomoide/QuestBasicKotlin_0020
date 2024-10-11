package com.example.paw_project

// Lambda Functions
// - They are typically used for creating simple functions.

// Function to convert a string to uppercase
fun uppercastString(string: String): String {
    return string.uppercase()
}

fun main (){
    // Calling the uppercaseString function
    println( uppercastString("hello world") )

    // Lambda expression to convert a string to uppercase
    println({string:String -> string.uppercase()}("hello kotlin"))
}