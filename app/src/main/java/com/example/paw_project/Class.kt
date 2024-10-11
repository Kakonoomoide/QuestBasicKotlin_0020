package com.example.paw_project

//create class motor
class Motor()

//create class Contact
class Contact(val id:Int, var email:String)

fun main(){
    //create object for class contact
    val contact = Contact(1,"rizki@gmail.com")

    //print the one of value object contact
    println(contact.email)

    //update the value of email in object contact
    contact.email = "kakonoomoide@gmail.com"

    //print the new email value object contact
    println(contact.email)
}