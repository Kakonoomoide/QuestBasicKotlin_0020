package com.example.paw_project

// A data class in Kotlin is a special type of class that is primarily used to hold data.
// Create simple data class with properties: `id` (Int) and `email` (String).
data class DataClass(
    val id: Int,
    var email: String
)

fun main(){
    // Create an instance of DataClass
    val data = DataClass(1, "rizki@gmail.com")
    println(data)

}