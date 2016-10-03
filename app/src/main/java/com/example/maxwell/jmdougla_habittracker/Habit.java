package com.example.maxwell.jmdougla_habittracker;

/**
 * Created by Maxwell on 2016-10-02.
 */
public class Habit {
    protected String habitName;
    protected boolean status;
    protected int TimesCompleted;
    protected int TimesIncompleted;
    // This is a string 7 characters long representing monday to sunday
    // A 1 means this habit is done on that day, a zero means it is not
    protected String habitDays;

    public Habit(String habitName) {
        this.habitName = habitName;
    }

    public boolean getStatus(){ return status; }
    public String getName() { return habitName; }
    public int getTimesCompleted() { return TimesCompleted; }
    public int getTimesIncompleted() { return TimesIncompleted; }
    public String getHabitDays() { return habitDays;}

}
