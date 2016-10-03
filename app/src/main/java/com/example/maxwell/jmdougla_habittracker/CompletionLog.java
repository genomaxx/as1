package com.example.maxwell.jmdougla_habittracker;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Maxwell on 2016-10-03.
 */
public class CompletionLog {

    protected static ArrayList<Habit_Instance> Completions;

    public CompletionLog () {
        Completions = new ArrayList<Habit_Instance>();
    }

    public Collection<Habit_Instance> getCompletionLog() {
        return Completions;
    }

    public static void addHabitInstance(Habit_Instance habitName) {
        Completions.add(habitName);
    }

    public static void deleteHabitInstance(Habit_Instance habitName) {
        Completions.remove(habitName);
    }
}
