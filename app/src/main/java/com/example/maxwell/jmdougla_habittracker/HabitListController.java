package com.example.maxwell.jmdougla_habittracker;

/**
 * Created by Maxwell on 2016-10-03.
 */
public class HabitListController {
    private static HabitList habitList = null;

    static public HabitList getHabitList() {
        if (habitList == null) {
            habitList = new HabitList();
        }
        return habitList;
    }

    public void addHabit(Habit habit) {
        getHabitList().addHabit(habit);
    }
}
