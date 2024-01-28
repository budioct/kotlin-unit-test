package com.tutorial

class Calculator {

    fun add(first: Int, second: Int): Int {
        return first + second
    }

    fun devide(first: Int, second: Int): Int {
        if (second == 0) {
            throw IllegalArgumentException("Cat not divide by zero")
        } else {
            return first / second
        }
    }


}