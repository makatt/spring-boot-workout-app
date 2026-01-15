package org.example.springbootworkoutapp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "exercise", schema = "workout")
public class Exercise {
    @Id
    @Column(name = "exercise_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int exercise_id;

    @Column(name = "name")
    private String name;

    @Column(name = "musclegroup")
    private String musclegroup;

    public int getExercise_id() {
        return exercise_id;
    }
    public void setExercise_id(int exercise_id) {
        this.exercise_id = exercise_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMusclegroup() {
        return musclegroup;
    }
    public void setMusclegroup(String musclegroup) {
        this.musclegroup = musclegroup;
    }

}
