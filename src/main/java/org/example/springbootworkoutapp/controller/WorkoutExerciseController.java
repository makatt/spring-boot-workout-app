package org.example.springbootworkoutapp.controller;


import org.example.springbootworkoutapp.dto.WorkoutExerciseRequest;
import org.example.springbootworkoutapp.dto.WorkoutExerciseResponse;
import org.example.springbootworkoutapp.service.WorkoutExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workout_exercise")
public class WorkoutExerciseController {

    @Autowired
    private WorkoutExerciseService workoutExerciseService;

    @GetMapping("")
    public List<WorkoutExerciseResponse> getAllWorkoutExercises() {
        return workoutExerciseService.getAllWorkoutExercises();
    }

    @PostMapping("")
    public WorkoutExerciseResponse addWorkoutExercise(@RequestBody WorkoutExerciseRequest workoutExerciseRequest) {
        return workoutExerciseService.createWorkoutExercise(workoutExerciseRequest);
    }
}
