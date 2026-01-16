package org.example.springbootworkoutapp.repository;

import org.example.springbootworkoutapp.entity.WorkoutExercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutExerciseRepo extends JpaRepository<WorkoutExercise, Long> {
}
