package com.pascalhow.italianhand.recipe

import android.content.Intent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.pascalhow.recipe.RecipeActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class RecipeActivityTest {
    @get:Rule
    var activityRule: ActivityTestRule<RecipeActivity> =
        ActivityTestRule(RecipeActivity::class.java)

    @Test
    fun testRecipeScreen() {
        activityRule.launchActivity(Intent())

        onView(withText("Recipe")).check(matches(isDisplayed()))
    }
}