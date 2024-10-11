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
    println("=== MAP ===")

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

    // Change mutable Set to read-only Set
    val shapeLocked: Set<String> = shape
    println(shapeLocked)
}

// A map is a collection of key-value pairs, where each key is unique.
fun MapExample(){
    println()
    println("=== MAP ===")

    // Read-Only Map
    // .. A map created using `mapOf()` contains unique key-value pairs and cannot be modified.
    val readOnlyMap: Map<String, Int> = mapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(readOnlyMap)

    // Mutable Map
    // .. A map created using `mutableMapOf()` allows for dynamic modification.
    val shape: MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(shape)

    // Add data to MutableMap (Shape)
    shape["Rectangle"] = 4
    println(shape)

    // Remove data to MutableSet (Shape)
    shape.remove("Circle")
    println(shape)

    // Change an element in the Mutable Map (Shape)
    shape["Square"] = 5
    println(shape)

    // Change mutable Map to read-only Map
    val shapeLocked: Map<String, Int> = shape
    println(shapeLocked)
}

fun main(){
    ListExample()
    SetExample()
    MapExample()
}
