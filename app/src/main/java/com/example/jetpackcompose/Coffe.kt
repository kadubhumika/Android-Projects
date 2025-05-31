package com.example.jetpackcompose

class Coffe constructor(val name: String , var sugar : Int , var milk : Int){
    val greet = "Hello $name Welcom To Our Cofee Cafee!"
    init {
        done()
    }
    fun done(){
        println("Your Coffee is Ready !")

    }





}