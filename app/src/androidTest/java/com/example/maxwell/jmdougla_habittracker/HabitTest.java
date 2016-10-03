package com.example.maxwell.jmdougla_habittracker;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by Maxwell on 2016-10-02.
 */
public class HabitTest extends ActivityInstrumentationTestCase2 {
    public HabitTest() {super(MainActivity.class);}

    public void testHabit(){
        String habitName = "Read Foreign Affairs";
        Habit habit = new Habit(habitName);
        assertTrue("Habit Name is not equal", habitName.equals(habit.getName()));
        assertTrue("Habit Name.toString is not equal", habitName.toString().equals(habit.getName
                ()));
    }
}
