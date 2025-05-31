package com.example.jetpackcompose

import org.intellij.lang.annotations.Language
import javax.microedition.khronos.opengles.GL10

data class StudentDetails(
    val name: String,
    val age: Int,
    val gender: String,
    val percentage10: Double,
    val percentage12: Double,
    val games: List<String>,
    val skills: List<String>
)

fun main() {
    val student1 = StudentDetails(
        "Bhumika", 19, "Female", 89.8, 85.2,
        games = listOf("Cricket", "Badminton"),
        skills = listOf("Singing", "Dancing")
    )

    val student2 = StudentDetails(
        "Anushka", 18, "Female", 75.0, 78.0,
        games = listOf("Football"),
        skills = listOf("Drawing")
    )

    Admission(student1)
    ExtraActivities(student1, student2)
}

fun ExtraActivities(student1: StudentDetails, student2: StudentDetails) {
    if ((student1.games.size > student2.games.size) && (student1.skills.size > student2.skills.size))
        println("{${student1.name}} can participate in extra activities!")
    else
        println("{${student1.name}} can't participate in extra activities!")
}

fun Admission(student: StudentDetails) {
    if (student.percentage10 >= 80 && student.percentage12 >= 80)
        println("Yup! She can take admission in college!")
    else if (student.percentage10 < 80 && student.percentage12 < 80)
        println("Needs to pay extra money for admission!")
    else
        println("Sorry! She can't take admission in college!")
}
