package org.example.springbootworkoutapp.service;

import org.example.springbootworkoutapp.entity.Exercise;
import org.example.springbootworkoutapp.repository.ExerciseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseService {


    @Autowired
    private ExerciseRepo exerciseRepo;

    public List<Exercise> getAllExercises() {
        return exerciseRepo.findAll();
    }

    public Exercise getExerciseById(int id) {
        return exerciseRepo.findById((long) id)
                .orElseThrow(() -> new RuntimeException("Exercise not found"));
    }

    public Exercise addExercise(Exercise exercise) {
        return exerciseRepo.save(exercise);
    }

    public Exercise updateExercise(Exercise exercise) {
        return exerciseRepo.save(exercise);
    }

    public void deleteExerciseById(int id) {
        exerciseRepo.deleteById((long) id);
    }

    public void deleteExercise(Exercise exercise) {
        exerciseRepo.delete(exercise);
    }
}
