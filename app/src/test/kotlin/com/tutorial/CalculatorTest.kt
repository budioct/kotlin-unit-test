package com.tutorial

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class CalculatorTest {

    val calculator = Calculator()

    @Test
    fun testAddSucces() {

        val result = calculator.add(10, 10)

        assertEquals(20, result)

    }

    @Test
    fun testAddFailed() {

        val result = calculator.add(10, 10)

        assertNotEquals(10, result)

    }


}