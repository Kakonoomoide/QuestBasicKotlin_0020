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

    // Safe call operator
    // - The safe call operator (?.) allows access to properties or methods of a nullable type without risking a NullPointerException.
    // - If nullable is null, the expression will return null instead of throwing an error.
    println(neverNull.length) // Prints: 18
    println(nullable?.length) // Prints: null

    // Function strLength
    // - This function takes a non-nullable String parameter `notNull`.
    // - It calculates and returns the length of the provided string.
    fun strLength(notNull: String): Int {
        return notNull.length
    }

    println(strLength(neverNull)) // Prints: 18
}

fun main(){
    nullSafety()
}