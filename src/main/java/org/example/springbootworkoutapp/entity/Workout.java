package org.example.springbootworkoutapp.entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "workout", schema = "workout")
public class Workout {

    @Id
    @Column(name = "workout_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int workout_id;

    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;

    public int getWorkout_id() {
        return workout_id;
    }
    public void setWorkout_id(int workout_id) {
        this.workout_id = workout_id;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
}
