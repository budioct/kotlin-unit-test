package com.tutorial

import org.junit.jupiter.api.Test
import org.opentest4j.TestAbortedException

class MembatalkanTest {

    @Test
    fun testAborted() {

        val profile = System.getenv()["PROFILE"]
        if ("DEV" == profile) {
            throw TestAbortedException()
        }

        // batalkan test
    }

}