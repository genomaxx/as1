package com.example.maxwell.jmdougla_habittracker;

/**
 * Created by Maxwell on 2016-10-02.
 */
public class Habit {
    protected String habitName;

    public Habit(String habitName) {
        this.habitName = habitName;

    }

    public String getName() {
        return habitName;
    }
}
