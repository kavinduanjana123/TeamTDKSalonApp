package com.example.salonappnew;

import android.os.IBinder;
import android.view.WindowManager;

import androidx.test.espresso.Root;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class ToastMatcher extends TypeSafeMatcher<Root>{

    //error message that display when toast is not working
    @Override
    public void describeTo(Description description) {
        description.appendText("Toast is");

    }
        @Override
        protected boolean matchesSafely(Root root) {

            int type = root.getWindowLayoutParams().get().type; //get the type of the toast message from the layout
            if((type == WindowManager.LayoutParams.TYPE_TOAST)){ //checking the type is equal to the toast type
                IBinder windowToken = root.getDecorView().getWindowToken(); //Retrieve a unique token identifying the window this view is attached to
                //ibinder is the return value type of token
                IBinder appToken = root.getDecorView().getApplicationWindowToken();
                if (windowToken == appToken) {//if the both token matches this will be the token that we are looking for
                    return true;
                }
            }
            return false;
        }

    }


