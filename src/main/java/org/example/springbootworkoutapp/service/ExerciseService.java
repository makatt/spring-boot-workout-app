package org.example.springbootworkoutapp.service;

import org.example.springbootworkoutapp.dto.ExerciseRequest;
import org.example.springbootworkoutapp.dto.ExerciseResponse;
import org.example.springbootworkoutapp.entity.Exercise;
import org.example.springbootworkoutapp.repository.ExerciseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExerciseService {


    @Autowired
    private ExerciseRepo exerciseRepo;

    public ExerciseService(ExerciseRepo exerciseRepo) {
        this.exerciseRepo = exerciseRepo;
    }

    public List<ExerciseResponse> getAllExercises() {
        return exerciseRepo.findAll()
                .stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    public ExerciseResponse getExerciseById(int id) {
        Exercise exercise = exerciseRepo.findById((long) id)
                .orElseThrow(() -> new RuntimeException("Exercise not found"));
        return mapToResponse(exercise);
    }

    public ExerciseResponse addExercise(ExerciseRequest request) {
        Exercise exercise = new Exercise();
        exercise.setName(request.getName());
        exercise.setMusclegroup(request.getMuscleGroup());
        Exercise savedExercise = exerciseRepo.save(exercise);

        return mapToResponse(savedExercise);
    }

    public ExerciseResponse updateExercise(Long id, ExerciseRequest request) {
        Exercise exercise = new Exercise();
        exercise.setExercise_id(Math.toIntExact(id));
        exercise.setName(request.getName());
        exercise.setMusclegroup(request.getMuscleGroup());
        Exercise savedExercise = exerciseRepo.save(exercise);
        return mapToResponse(savedExercise);
    }

    public void deleteExerciseById(int id) {
        exerciseRepo.deleteById((long) id);
    }

    public void deleteExercise(Exercise exercise) {
        exerciseRepo.delete(exercise);
    }


    private ExerciseResponse mapToResponse(Exercise exercise) {
        return new ExerciseResponse(
                (long) exercise.getExercise_id(),
                exercise.getName(),
                exercise.getMusclegroup()
        );
    }
}
