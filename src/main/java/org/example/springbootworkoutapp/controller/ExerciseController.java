package org.example.springbootworkoutapp.controller;

import jakarta.validation.Valid;
import org.example.springbootworkoutapp.dto.ExerciseRequest;
import org.example.springbootworkoutapp.dto.ExerciseResponse;
import org.example.springbootworkoutapp.entity.Exercise;
import org.example.springbootworkoutapp.repository.ExerciseRepo;
import org.example.springbootworkoutapp.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@Tag(name = "Exercises", description = "Управление упражнениями")
@RestController
@RequestMapping("/exercise")
public class ExerciseController {

    @Autowired
    private ExerciseService exerciseService;

    @GetMapping("")
    public List<ExerciseResponse> getAllExercises() {
        return exerciseService.getAllExercises();
    }

    @GetMapping("/{id}")
    public ExerciseResponse getExerciseById(@PathVariable int id) { return exerciseService.getExerciseById(id); }


    @PostMapping("")
    public ExerciseResponse addExercise(@Valid @RequestBody ExerciseRequest request) {
        return exerciseService.addExercise(request);
    }

    @DeleteMapping("/{id}")
    public void deleteExerciseById(@PathVariable int id) {
        exerciseService.deleteExerciseById(id);
    }

    @DeleteMapping("")
    public void deleteAllExercises(Exercise exercise) {
        exerciseService.deleteExercise(exercise);
    }

    @PostMapping("/{id}")
    public ExerciseResponse updateExercise(
            @PathVariable Long id,
            @Valid @RequestBody ExerciseRequest request) {
        return exerciseService.updateExercise(id, request);
    }
}
