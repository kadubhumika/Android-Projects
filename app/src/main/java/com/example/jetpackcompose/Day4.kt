package com.example.jetpackcompose

fun main() {
    println("Welcome To Our Fruits Store Shop 🍎🍌🍇")
    println("Here are our list of fruits:")

    fruits() // Show available fruits

    customer() // Handle customer order
}

fun fruits() {
    val fruitsList: List<String> = listOf("Apple", "Mango", "Banana", "Grapes", "Kiwi")
    println(fruitsList)
}

fun customer() {
    val fruitsList: List<String> = listOf("Apple", "Mango", "Banana", "Grapes", "Kiwi")

    print("Enter your name: ")
    val name = readLine()

    print("Enter the fruit name you want to buy: ")
    val fruit = readLine()

    print("Enter the quantity you want to buy: ")
    val quantity = readLine()

    if (fruit != null && fruitsList.map { it.lowercase() }.contains(fruit.lowercase())) {
        println("$name ordered $quantity $fruit(s). Order placed successfully! ✅")
    } else {
        println("Sorry! It seems $fruit is out of stock or not available. ❌")
    }
}
