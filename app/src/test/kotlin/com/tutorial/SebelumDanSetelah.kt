package com.tutorial

import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class SebelumDanSetelah {

    /**
     * hasil compile
     * Before All
     * Before unit test
     * Hello World
     * After unit test
     * After All
     *
     */

    companion object {

        @BeforeAll // di jalankan paling awal sebelum unit test
        @JvmStatic // di kompile menjadi jvm static
        fun beforeAll() {

            println("Before All")
        }

        @AfterAll // di jalankan paling akhir setelah unit test
        @JvmStatic
        fun afterAll() {

            println("After All")
        }
    }

    @BeforeEach // di jalankan sebelum unit test
    fun setUp() {

        println("Before unit test")
    }

    @AfterEach // di jalankan setelah unit test
    fun tearDown() {

        println("After unit test")
    }

    @Test
    fun testHelloWorld() {

        println("Hello World")
    }


}