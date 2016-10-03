package com.example.maxwell.jmdougla_habittracker;

import android.test.ActivityInstrumentationTestCase2;

import java.util.Collection;

/**
 * Created by Maxwell on 2016-10-02.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2 {
    public MainActivityTest() {super(MainActivity.class);}

    public void testMainActivity() {
        MainActivity mainActivity = new MainActivity();
        Collection<Habit> Habits = mainActivity.getHabits();
        assertTrue("Empty Habit List",Habits.size() == 0);
    }

    public void testaddHabitMainActivity() {
        MainActivity mainActivity = new MainActivity();
        Collection<Habit> Habits = mainActivity.getHabits();
        assertTrue("Empty Habit List",Habits.size() == 0);
    }
}
