package com.tutorial

import com.tutorial.generator.SimpleDisplayNameGenerator
import org.junit.jupiter.api.*
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

//@DisplayName("Test Calculator Test") // native junit 5 // ubah nama unit test
@DisplayNameGeneration(SimpleDisplayNameGenerator::class) // generate junit 5 // implement ubah nama unit test
class CalculatorTest {

    val calculator = Calculator()

    @Test
    @DisplayName("test function Calculator.add(Int, Int)") // merubah nama unit test
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
    @DisplayName("test function Calculator.divide(Int, Int)") // merubah nama unit test
    fun testDeviceSuccess(){

        val result = calculator.divide(10, 2)
        Assertions.assertEquals(5, result)

    }

    @Test
    fun testDivideFailed(){

        val result = calculator.divide(10, 2)
        Assertions.assertNotEquals(2, result)

    }

    @Test
    fun testDevideError(){

        // test cek harus Error assertThrows<T>... // ekpetasi harus error
        assertThrows<IllegalArgumentException> {
            calculator.divide(100, 0)
        }

    }

    @Test
    @Disabled // non-aktifkan unit test
    fun testCommingSoon(){

        println("Comming Soon")

    }

    @Test
    fun testAssumption(){

        Assumptions.assumeTrue("DEV" == System.getenv().get("PROFILE"))// implement Assumptions unit test

        println("Benar ENV PROFILE ADALAH DEV")

    }




}