package com.example.salonappnew;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isClickable;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withHint;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.AllOf.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class AddcompanyToastTest {

        @Rule

        public ActivityTestRule<addcompany> company = new ActivityTestRule<>(addcompany.class);

        @Test
        public void cheackaddcompanytoast(){
            onView(withText("data valid"))
                    .inRoot(new ToastMatcher())
                    .check(matches(isDisplayed()));
        }

        @Test
        public void cheackaddcompanytoastisame(){
            onView(withText("data valid"))
                    .inRoot(new ToastMatcher())
                    .check(matches(withText("data valid")));
        }

        @Test
        public void cliclablebtnsubmit(){
            onView(allOf(withId(R.id.btn_sub),isClickable()));

        }

        public void withhintaddress(String address){
        onView(withHint("Address"));

        }


    }


