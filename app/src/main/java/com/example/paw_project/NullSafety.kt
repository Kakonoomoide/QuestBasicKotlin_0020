package com.example.paw_project

fun nullSafety(){
    //neverNull has String type
    var neverNull: String = "This can't be null"

    // Variable nullable of type String? can hold a null value
    var nullable: String? = "You can keep a null here"
    // This is OK
    nullable = null
}

fun main(){
    nullSafety()
}