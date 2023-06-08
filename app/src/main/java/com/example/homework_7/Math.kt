package com.example.homework_7

import java.text.NumberFormat
import java.text.ParsePosition
import kotlin.math.roundToInt

class Math {

    fun add(a: String, b: String): String {
        var result = ""
        if (a.isEmpty() || b.isEmpty()) {
            result = "Поля не должны быть пусты"
        } else if (a.contains(".") || b.contains(".")) {
            result = "Введите целые числа"
        } else if (!a.isNumeric() || !b.isNumeric()) {
            result = "Не должно быть символов"
        } else {
            result = (a.toDouble() + b.toDouble()).roundToInt().toString()
        }
        return result
    }

    fun divide(a: String, b: String): String {
        var result = " "
        if (b == "0") {
            result = "На 0 делить нельзя"
        } else if (!a.isNumeric() || !b.isNumeric()) {
            result = "Не должно быть символов"
        }else if (a.contains(".") || b.contains(".")) {
            result = "Введите целые числа"
        } else {
            result = (a.toInt() / b.toInt()).toString()
        }
        return result
    }
    private fun String.isNumeric(): Boolean {
        val pos = ParsePosition(0)
        NumberFormat.getInstance().parse(this, pos)
        return this.length == pos.index
    }
}