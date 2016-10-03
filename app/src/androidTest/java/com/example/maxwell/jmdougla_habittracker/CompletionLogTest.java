package com.example.maxwell.jmdougla_habittracker;

import android.test.ActivityInstrumentationTestCase2;

import java.util.Collection;

/**
 * Created by Maxwell on 2016-10-03.
 */
public class CompletionLogTest extends ActivityInstrumentationTestCase2{
    public CompletionLogTest() {super(CompletionLog.class);}

    public void testCompletionLog() {
        CompletionLog completionLog = new CompletionLog();
        Collection<Habit_Instance> Completions = completionLog.getCompletionLog();
        assertTrue("Empty Completion Log List",Completions.size() == 0);
    }

    public void testaddHabitInstancetoCompletionLog() {
        CompletionLog completionLog = new CompletionLog();
        String HabitName = "Write 200 words before bed";
        Habit_Instance testhabit = new Habit_Instance(HabitName,Boolean.FALSE);
        CompletionLog.addHabitInstance(testhabit);
        Collection<Habit_Instance> Completions = completionLog.getCompletionLog();
        assertTrue("Habit List Size",Completions.size() == 1);
        assertTrue("list contains this habit", Completions.contains(testhabit));
    }

    public void testRemoveHabitFromCompletionLog() {
        CompletionLog completionLog = new CompletionLog();
        String HabitName = "Write 200 words before bed";
        Habit_Instance testhabit = new Habit_Instance(HabitName,Boolean.TRUE);
        CompletionLog.addHabitInstance(testhabit);
        Collection<Habit_Instance> Completions = completionLog.getCompletionLog();
        assertTrue("Habit List Size",Completions.size() == 1);
        assertTrue("list contains this habit", Completions.contains(testhabit));
        CompletionLog.deleteHabitInstance(testhabit);
        Completions = completionLog.getCompletionLog();
        assertTrue("Habit List Size",Completions.size() == 0);
        assertFalse("list does not contain this habit", Completions.contains(testhabit));
    }
}
