package com.pascalhow.italianhand

import android.content.Intent
import android.os.SystemClock
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    var activityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Test
    fun testInitialScreen() {
        activityRule.launchActivity(Intent())

        onView(withText("Ciao")).check(matches(isDisplayed()))
    }

    @Test
    fun testButtonClick() {
        activityRule.launchActivity(Intent())

        onView(withText("Ciao")).perform(click())

        SystemClock.sleep(2000)
        onView(withText("I HATE pineapple pizza")).check(matches(isDisplayed()))
    }

    @Test
    fun testButtonClickWithFailure() {
        activityRule.launchActivity(Intent())

        onView(withText("Ciao")).perform(click())

        SystemClock.sleep(2000)
        onView(withText("I HATE Capriciosa pizza")).check(matches(isDisplayed()))
    }
}
