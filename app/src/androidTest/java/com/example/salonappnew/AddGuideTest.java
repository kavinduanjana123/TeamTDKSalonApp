package com.example.salonappnew;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

//TestCase Scenario

@LargeTest
@RunWith(AndroidJUnit4.class)

public class AddGuideTest {

    @Rule
   
    public ActivityTestRule<addproduct> room = new ActivityTestRule<>(addproduct.class);

    @Test
    public void addGuide(){
        onView(withText("Product added"))
                .inRoot(new ToastMatcher())
                .check(matches(isDisplayed()));
    }
}
