package com.example.paw_project

// list
fun ListExample(){
    println("=== LIST ===")

    // Read-Only list
    // ..You can`t change value of list if list use listof
    val readOnlyList = listOf("A","B","C")
    println(readOnlyList)

    // Mutable list
    // ..You can change value of list if the list use muablelistof
    val shape: MutableList<String> = mutableListOf("Circle","Square","Triangle")
    println(shape)

    // Add data to Mutable List (Shape)
    shape.add("Circle")
    println(shape)

    // Remove data to Mutable List (Shape)
    shape.remove("Triangle")
    println(shape)

    // Change an element in the Mutable List (Shape)
    shape[0] = ("Oval")
    println(shape)

    // Change mutable list to read-only list
    val shapeLocked: List<String> = shape
    println(shapeLocked)
}

// set
fun SetExample(){

}

// map
fun MapExample(){

}

fun main(){
    ListExample()
}
