package org.example.springbootworkoutapp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "workout_exercise",schema = "workout")
public class WorkoutExercise {

    @Id
    @Column(name = "workout_exercise_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long workout_exercise_id;

    //Связанная сущность НЕ загружается сразу из БД.
    //Она подгружается только когда к ней обращаешься
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workout", nullable = false)
    private Workout workout;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "exercise")
    private Exercise exercise;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sets", nullable = false)
    private Set sets;

    public Long getWorkout_exercise_id() {
        return workout_exercise_id;
    }
    public void setWorkout_exercise_id(Long workout_exercise_id) {
        this.workout_exercise_id = workout_exercise_id;
    }
    public Workout getWorkout() {
        return workout;
    }
    public void setWorkout(Workout workout) {
        this.workout = workout;
    }
    public Exercise getExercise() {
        return exercise;
    }
    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }
    public Set getSets() {
        return sets;
    }
    public void setSets(Set sets) {
        this.sets = sets;
    }


}
