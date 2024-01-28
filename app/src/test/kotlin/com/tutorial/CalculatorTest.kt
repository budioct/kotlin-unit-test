package com.tutorial

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class CalculatorTest {

    val calculator = Calculator()

    @Test
    fun testAddSucces() {

        val result = calculator.add(10, 10)

        assertEquals(20, result) // package kotlin
        Assertions.assertEquals(20, result, "hasil harunya 20 broo") // package junit-5

        /**
         * jika ingin lihat gagal di browser
         * project\app\build\reports\tests\test\index.html
         */

    }

    @Test
    fun testAddFailed() {

        val result = calculator.add(10, 10)

        assertNotEquals(10, result)
        Assertions.assertNotEquals(10, result)

    }

    @Test
    fun testDeviceSuccess(){

        val result = calculator.devide(10, 2)
        Assertions.assertEquals(5, result)

    }

    @Test
    fun testDivideFailed(){

        val result = calculator.devide(10, 2)
        Assertions.assertNotEquals(2, result)

    }

    @Test
    fun testDevideError(){

        // test cek harus Error assertThrows<T>... // ekpetasi harus error
        assertThrows<IllegalArgumentException> {
            calculator.devide(100, 0)
        }

    }


}