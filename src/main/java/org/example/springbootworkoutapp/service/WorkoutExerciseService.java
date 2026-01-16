package org.example.springbootworkoutapp.service;

import org.example.springbootworkoutapp.dto.WorkoutExerciseRequest;
import org.example.springbootworkoutapp.dto.WorkoutExerciseResponse;
import org.example.springbootworkoutapp.dto.WorkoutRequest;
import org.example.springbootworkoutapp.dto.WorkoutResponse;
import org.example.springbootworkoutapp.entity.WorkoutExercise;
import org.example.springbootworkoutapp.repository.ExerciseRepo;
import org.example.springbootworkoutapp.repository.SetRepo;
import org.example.springbootworkoutapp.repository.WorkoutExerciseRepo;
import org.example.springbootworkoutapp.repository.WorkoutRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WorkoutExerciseService {

    @Autowired
    WorkoutExerciseRepo workoutExerciseRepo;

    @Autowired
    private WorkoutRepo workoutRepo;

    @Autowired
    private ExerciseRepo exerciseRepo;

    @Autowired
    private SetRepo setRepo;

    public List<WorkoutExerciseResponse> getAllWorkoutExercises() {
        return workoutExerciseRepo.findAll()
                .stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    public WorkoutExerciseResponse getWorkoutExerciseById(Long id) {
        WorkoutExercise ws = workoutExerciseRepo.findById(id)
                 .orElseThrow(()-> new RuntimeException("Error"));
         return mapToResponse(ws);

    }

    public WorkoutExerciseResponse createWorkoutExercise(WorkoutExerciseRequest workoutExerciseRequest) {
         WorkoutExercise ws = new WorkoutExercise();
         ws.setWorkout(workoutRepo.getReferenceById((long) workoutExerciseRequest.getWorkout()));
         ws.setExercise(exerciseRepo.getReferenceById((long) workoutExerciseRequest.getExercise()));
         ws.setSets(setRepo.getReferenceById((long) workoutExerciseRequest.getSets()));
         WorkoutExercise wss = workoutExerciseRepo.save(ws);
         return mapToResponse(wss);
    }

    public WorkoutExerciseResponse mapToResponse(WorkoutExercise workoutExercise) {
        return new WorkoutExerciseResponse(
                workoutExercise.getWorkout_exercise_id(),
                workoutExercise.getWorkout().getWorkout_id(),
                workoutExercise.getExercise().getExercise_id(),
                workoutExercise.getSets().getSet_id());
    }


}
