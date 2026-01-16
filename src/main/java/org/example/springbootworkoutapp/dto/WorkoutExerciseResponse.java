package org.example.springbootworkoutapp.dto;

import org.example.springbootworkoutapp.entity.Exercise;
import org.example.springbootworkoutapp.entity.Set;
import org.example.springbootworkoutapp.entity.Workout;

public class WorkoutExerciseResponse {

    private Long workout_exercise_id;
    private int workout;
    private int exercise;
    private int sets;

    public WorkoutExerciseResponse( Long workout_exercise_id, int workout, int exercise, int sets ) {
        this.workout_exercise_id = workout_exercise_id;
        this.workout = workout;
        this.exercise = exercise;
        this.sets = sets;
    }

    public Long getWorkout_exercise_id() {
        return workout_exercise_id;
    }
    public int getWorkout() {
        return workout;
    }
    public int getExercise() {
        return exercise;
    }
    public int getSets() {
        return sets;
    }
}
