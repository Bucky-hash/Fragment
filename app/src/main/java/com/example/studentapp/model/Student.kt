package com.example.studentapp.model
import java.io.Serializable
data class Student(
    val id: String,
    val name: String,
    val email: String,
    val major: String
) : Serializable