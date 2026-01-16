package org.example.springbootworkoutapp.controller;


import org.example.springbootworkoutapp.dto.WorkoutRequest;
import org.example.springbootworkoutapp.dto.WorkoutResponse;
import org.example.springbootworkoutapp.entity.Workout;
import org.example.springbootworkoutapp.service.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workout")
public class WorkoutController {

    @Autowired
    private WorkoutService workoutService;

    @GetMapping("")
    public List<WorkoutResponse> getAllWorkouts() {
        return workoutService.getAllWorkouts();
    }

    @GetMapping("/{id}")
    public WorkoutResponse getWorkoutById(@PathVariable Long id) {
        return workoutService.getWorkoutById(id);
    }

    @PostMapping("")
    public WorkoutResponse addWorkout(@RequestBody WorkoutRequest workoutRequest) {
        return workoutService.addWorkout(workoutRequest);
    }

    @PostMapping("/{id}")
    public WorkoutResponse updateWorkout(@PathVariable Long id, @RequestBody WorkoutRequest workoutRequest) {
        return workoutService.updateWorkout(id, workoutRequest);
    }

    @DeleteMapping("/{id}")
    public void deleteWorkout(@PathVariable Long id) {
        workoutService.deleteWorkout(id);
    }

    @DeleteMapping("")
    public void deleteAllWorkouts() {
        workoutService.deleteAllWorkouts();
    }
}
