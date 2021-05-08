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

@LargeTest
@RunWith(AndroidJUnit4.class)


public class AddAppointmentTest {

    @Rule

    public ActivityTestRule<addapoint> room = new ActivityTestRule<>(addapoint.class);

    @Test
    public void addAppointment(){
        onView(withText("Appointment added successfully"))
                .inRoot(new ToastMatcher())
                .check(matches(isDisplayed()));
    }
}
