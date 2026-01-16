package org.example.springbootworkoutapp.service;

import org.example.springbootworkoutapp.dto.WorkoutRequest;
import org.example.springbootworkoutapp.dto.WorkoutResponse;
import org.example.springbootworkoutapp.entity.Workout;
import org.example.springbootworkoutapp.repository.WorkoutRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class WorkoutService {

    @Autowired
    WorkoutRepo workoutRepo;

    public List<WorkoutResponse> getAllWorkouts() {
        return workoutRepo.findAll()
                .stream()
                .map(this::mapToWorkout)
                .collect(Collectors.toList());

    }

    public WorkoutResponse getWorkoutById(Long id) {
        Workout workout = workoutRepo.findById(id)
                                    .orElseThrow(() -> new RuntimeException("Не получить тренировку по id"));
        return mapToWorkout(workout);

    }

    public WorkoutResponse addWorkout(WorkoutRequest workoutRequest) {
        Workout workout = new Workout();
        workout.setDate((Date) workoutRequest.getDate());
        Workout savedWorkout = workoutRepo.save(workout);
        return mapToWorkout(savedWorkout);

    }

    public WorkoutResponse updateWorkout(Long id, WorkoutRequest workoutRequest) {
        Workout workout = new Workout();
        workout.setWorkout_id(Math.toIntExact(id));
        workout.setDate((Date) workoutRequest.getDate());
        Workout savedWorkout = workoutRepo.save(workout);
        return mapToWorkout(savedWorkout);
    }

    public void deleteWorkout(Long id) {
        workoutRepo.deleteById(id);
    }

    public void deleteAllWorkouts() {
        workoutRepo.deleteAll();
    }

    public WorkoutResponse mapToWorkout(Workout workout) {
        return new WorkoutResponse(workout.getWorkout_id(),workout.getDate());
    }
}
