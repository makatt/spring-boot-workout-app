package org.example.springbootworkoutapp.dto;

public class WorkoutExerciseRequest {

    private int workout;
    private int exercise;
    private int sets;

    public int getExercise() {
        return exercise;
    }
    public void setExercise(int exercise) {
        this.exercise = exercise;
    }
    public int getSets() {
        return sets;
    }
    public void setSets(int sets) {
        this.sets = sets;
    }
    public int getWorkout() {
        return workout;
    }
    public void setWorkout(int workout) {
        this.workout = workout;
    }

}
