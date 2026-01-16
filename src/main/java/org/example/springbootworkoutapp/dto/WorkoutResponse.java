package org.example.springbootworkoutapp.dto;

import java.sql.Date;

public class WorkoutResponse {

    private int workout_id;
    private Date date;

    public WorkoutResponse( int workout_id, Date date) {
        this.workout_id = workout_id;
        this.date = date;
    }

    public int getWorkout_id() {
        return workout_id;
    }

    public Date getDate() {
        return date;
    }
}
