package com.thevery.robotestapp

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RuntimeEnvironment

@RunWith(Runner2::class)
class ExampleUnitTest5 {
    @Test
    fun addition_isCorrect() {
        val appContext = RuntimeEnvironment.application
        assertEquals("package2", appContext.packageName)
    }
}
