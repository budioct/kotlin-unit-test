package com.tutorial

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.condition.*

class SystemOperation {

    @Test
    @EnabledOnOs(value = [OS.WINDOWS])
    fun onlyRunOnWindows(){

        // hanya jalan di windows
        println("Os Windows")
    }

    @Test
    @EnabledOnOs(value = [OS.WINDOWS, OS.LINUX])
    fun onlyRunOnWindowsOrLinux(){

        // hanya jalan di windows
        println("Os Windows")
    }

    @Test
    @DisabledOnOs(value = [OS.WINDOWS])
    fun disabledOnWindows(){

        // tidak bisa jalan di windows
    }

    @Test
    @EnabledOnJre(value = [JRE.JAVA_21, JRE.JAVA_11, JRE.JAVA_17, JRE.JAVA_8])
    fun onlyRunOnJavaLongTermSupport(){

        println("Only Java LTS")

    }

    @Test
    @DisabledOnJre(value = [JRE.JAVA_9, JRE.JAVA_12])
    fun nonJRELTS(){

        // tidak bisa jalan di JRE non-LTS
    }

}