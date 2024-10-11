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

    // Function Equals
    // - Compares two DataClass instances for equality based on their properties.
    val data2 = DataClass(1, "makan@gmail.com")
    println(data == data2) // result : False

    // Function Copy
    // - Creates a new instance of DataClass with the same property values as the original instance.
    val data3 = data.copy()
    println(data3) // result : same with data
}