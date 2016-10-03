package com.example.maxwell.jmdougla_habittracker;

import android.test.ActivityInstrumentationTestCase2;

import java.util.Collection;

/**
 * Created by Maxwell on 2016-10-02.
 */
public class HabitListTest extends ActivityInstrumentationTestCase2 {
    public HabitListTest() {super(HabitList.class);}

    public void testHabitList() {
        HabitList habitList = new HabitList();
        Collection<Habit> Habits = habitList.getHabits();
        assertTrue("Empty Habit List",Habits.size() == 0);
    }

    public void testaddHabittoHabitList() {
        HabitList habitList = new HabitList();
        String HabitName = "Write 200 words before bed";
        Habit testhabit = new Habit(HabitName);
        HabitList.addHabit(testhabit);
        Collection<Habit> Habits = habitList.getHabits();
        assertTrue("Habit List Size",Habits.size() == 1);
        assertTrue("list contains this habit", Habits.contains(testhabit));
    }

    public void testRemoveHabitFromHabitList() {
        HabitList habitList = new HabitList();
        String HabitName = "Write 200 words before bed";
        Habit testhabit = new Habit(HabitName);
        HabitList.addHabit(testhabit);
        Collection<Habit> Habits = habitList.getHabits();
        assertTrue("Habit List Size",Habits.size() == 1);
        assertTrue("list contains this habit", Habits.contains(testhabit));
        HabitList.deleteHabit(testhabit);
        Habits = habitList.getHabits();
        assertTrue("Habit List Size",Habits.size() == 0);
        assertFalse("list does not contain this habit", Habits.contains(testhabit));
    }
}
