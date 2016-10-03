package com.example.maxwell.jmdougla_habittracker;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ApplicationTestCase;

import junit.framework.TestCase;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class HabitTrackerTest extends ActivityInstrumentationTestCase2 {
    public HabitTrackerTest() {
        super(com.example.maxwell.jmdougla_habittracker.MainActivity.class);
    }

    public void testStart() throws Exception {
        Activity activity = getActivity();
    }
}