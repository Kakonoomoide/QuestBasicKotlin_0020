package com.example.paw_project

// A list is an ordered collection of elements that can contain duplicates
fun ListExample(){
    println("=== LIST ===")

    // Read-Only list
    // .. You can`t change value of list if list use listof
    val readOnlyList = listOf("A","B","C")
    println(readOnlyList)

    // Mutable list
    // .. You can change value of list if the list use muablelistof
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

// A set is an unordered collection of unique elements.
fun SetExample(){
    println()
    println("=== Set ===")

    // Read-Only set
    // .. A set created using `setOf()` contains unique elements and cannot be modified.
    val readOnlySet = setOf("A","B","C")
    println(readOnlySet)

    // Mutable Set
    // .. A set created using `mutableSetOf()` allows for dynamic modification.
    val shape: MutableSet<String> = mutableSetOf("Circle","Square","Triangle")
    println(shape)

    // Add data to MutableSet (Shape)
    shape.add("Rectangle")
    println(shape)

    // Remove data to MutableSet (Shape)
    shape.remove("Circle")
    println(shape)

    // Change mutable list to read-only list
    val shapeLocked: Set<String> = shape
    println(shapeLocked)
}

// map
fun MapExample(){

}

fun main(){
    ListExample()
    SetExample()
}
