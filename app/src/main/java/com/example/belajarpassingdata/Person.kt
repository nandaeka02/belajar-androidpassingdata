package com.example.belajarpassingdata

import java.io.Serializable

data class Person(
    val Name: String,
    val Age: Int,
    val Country: String
) : Serializable