package com.example.jetpackcompose

class ShoppingApp constructor(val customerName: String) {

    val detailsOfCustomer = "Details of $customerName are listed below:"

    init {
        println(detailsOfCustomer)
        greetCustomer()
        dress()
        accessories()
        food()
    }

    private fun greetCustomer() {
        println("Hello $customerName")
        println("Welcome to the Shopping App")
    }

    private fun dress() {
        println("$customerName bought a Neckdeep dress")
    }

    private fun accessories() {
        println("$customerName bought a belt")
    }

    private fun food() {
        println("$customerName bought a sandwich")
        println("$customerName bought a cake")
    }
}
