package com.tutorial.generator

import org.junit.jupiter.api.DisplayNameGenerator
import java.lang.reflect.Method

class SimpleDisplayNameGenerator : DisplayNameGenerator {
    override fun generateDisplayNameForClass(testClass: Class<*>): String {

        return "Test22 ${testClass.name}"
    }


    override fun generateDisplayNameForMethod(testClass: Class<*>?, testMethod: Method): String {

        val simpleName = testMethod.name.replace("_", "")
        return "Test22 $simpleName"
    }

    override fun generateDisplayNameForNestedClass(testClass: Class<*>): String {

        return "Test22 ${testClass.simpleName}"
    }

}