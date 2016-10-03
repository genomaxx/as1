package com.example.maxwell.jmdougla_habittracker;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Maxwell on 2016-10-03.
 */
public class HabitList {
    
    protected static ArrayList<Habit> Habits;
    protected static ArrayList<Listener> listeners;

    public HabitList () {
        Habits = new ArrayList<Habit>();
        listeners = new ArrayList<Listener>();
    }

    public Collection<Habit> getHabits() { return Habits; }

    public static void addHabit(Habit habitName) {
        Habits.add(habitName);
        notifyListeners();
    }

    public static void deleteHabit(Habit habitName) {
        Habits.remove(habitName);
    }
    public boolean contains(Habit habit) { return Habits.contains(habit); }

    public static void notifyListeners() {
        for (Listener listener : listeners) {
            listener.update();
        }
    }

    public void addListener(Listener l) {
        listeners.add(l);
    }
    public void removeListener(Listener l) {
        listeners.remove(l);
    }
}
