package com.example.maxwell.jmdougla_habittracker;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Maxwell on 2016-10-03.
 */
public class HabitList {
    
    protected static ArrayList<Habit> Habits;

    public HabitList () {
        Habits = new ArrayList<Habit>();
    }

    public Collection<Habit> getHabits() {
        return Habits;
    }

    public static void addHabit(Habit habitName) {
        Habits.add(habitName);
    }

    public static void deleteHabit(Habit habitName) {
        Habits.remove(habitName);
    }
}
