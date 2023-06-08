package com.example.homework_7

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class ActivityTest {

    @Rule
    @JvmField
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun add() {
        Espresso.onView(withId(R.id.firstNumber)).perform(ViewActions.typeText("30"))
        Espresso.onView(withId(R.id.firstNumber)).perform(ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.secondNumber)).perform(ViewActions.typeText("7"))
        Espresso.onView(withId(R.id.secondNumber)).perform(ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.btn_calculate)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.result_tv))
            .check(ViewAssertions.matches(ViewMatchers.withText("37")))
    }

    @Test
    fun divide() {
        Espresso.onView(withId(R.id.firstNumber)).perform(ViewActions.typeText("15"))
        Espresso.onView(withId(R.id.firstNumber)).perform(ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.secondNumber)).perform(ViewActions.typeText("3"))
        Espresso.onView(withId(R.id.secondNumber)).perform(ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.btn_divide)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.result_tv))
            .check(ViewAssertions.matches(ViewMatchers.withText("5")))
    }
}