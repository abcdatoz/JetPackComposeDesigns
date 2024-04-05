package com.example.instagramapp.tools

import java.text.NumberFormat
import java.util.Locale

fun toMoney(cantidad: Double): String{

    val format = NumberFormat.getCurrencyInstance(Locale.US)

    val numberFormated = format.format(cantidad)


    return numberFormated
}