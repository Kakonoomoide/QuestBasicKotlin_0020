package com.example.paw_project

fun nullSafety(){
    //neverNull has String type
    var neverNull: String = "This can't be null"

    // Variable nullable of type String? can hold a null value
    var nullable: String? = "You can keep a null here"
    // This is OK
    nullable = null

    // Check for null in conditions
    // - This condition checks if the neverNull variable is null.
    if (neverNull == null) {
        println("neverNull is null") // This line will never run
    } else {
        println("neverNull is not null") // This line will always run
    }
}

fun main(){
    nullSafety()
}