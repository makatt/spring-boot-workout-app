package org.example.springbootworkoutapp.controller;

import org.example.springbootworkoutapp.entity.Exercise;
import org.example.springbootworkoutapp.repository.ExerciseRepo;
import org.example.springbootworkoutapp.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercise")
public class ExerciseController {

    @Autowired
    private ExerciseService exerciseService;

    @GetMapping("")
    public List<Exercise> getAllExercises() {
        return exerciseService.getAllExercises();
    }


    @GetMapping("/{id}")
    public Exercise getExerciseById(@PathVariable int id) { return exerciseService.getExerciseById(id); }

    @PostMapping("")
    public Exercise addExercise(@RequestBody Exercise exercise) {
        return exerciseService.addExercise(exercise);
    }

    @DeleteMapping("")
    public void deleteExerciseById(@PathVariable int id) {
        exerciseService.deleteExerciseById(id);
    }

    @DeleteMapping("")
    public void deleteAllExercises(Exercise exercise) {
        exerciseService.deleteExercise(exercise);
    }

    @PostMapping("")
    public Exercise updateExercise(@RequestBody Exercise exercise) {
        return exerciseService.updateExercise(exercise);
    }
}
