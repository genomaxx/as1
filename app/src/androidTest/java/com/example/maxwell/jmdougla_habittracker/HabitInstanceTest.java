package com.example.maxwell.jmdougla_habittracker;

import android.test.ActivityInstrumentationTestCase2;
/**
 * Created by Maxwell on 2016-10-03.
 */
public class HabitInstanceTest extends ActivityInstrumentationTestCase2 {
    public HabitInstanceTest() {super(MainActivity.class);}

    public void testHabitInstanceStatusAndName() {
        Boolean status = Boolean.FALSE;
        String habitName = "Write 200 words before bed";
        Habit_Instance habit_instance = new Habit_Instance(habitName, status);
        assertTrue("Current status is not false!",status.equals(habit_instance.getStatus()));
        assertTrue("name is not equal!", habitName.equals(habit_instance.getName()));
    }
}
