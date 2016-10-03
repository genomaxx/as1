package com.example.maxwell.jmdougla_habittracker;

import java.util.Date;

/**
 * Created by Maxwell on 2016-10-02.
 *
 * Each item in the completion log that is viewable by the user will be an instance of this class.
 * They will be able to change the status of the instance (completed or not completed) at any
 * time after the habit has occurred. They will not be able to change the date of the instance or
 * the name of it, these will both be automatically filled.
 */
public class Habit_Instance {
    protected String habitName;
    protected boolean status;
    private Date date;

    public Habit_Instance(String habitName, Boolean status) {
        this.habitName = habitName;
        this.date = new Date();
        this.status = status;
    }

    public boolean getStatus(){ return status; }
    public String getName() { return habitName; }
    public Date getDate() {
        return date;
    }
}
