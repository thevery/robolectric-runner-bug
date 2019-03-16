package com.thevery.robotestapp

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RuntimeEnvironment

@RunWith(Runner1::class)
class ExampleUnitTest8 {
    @Test
    fun addition_isCorrect() {
        val appContext = RuntimeEnvironment.application
        assertEquals("package1", appContext.packageName)
    }
}
