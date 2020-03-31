package com.pascalhow.recipe

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class RecipeUnitTest {
    @Test
    fun `Pizza Addition`() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun `test Hawaiian Pizza`() {
        assertEquals(21, "I love hawaiian pizza".length)
    }
}
