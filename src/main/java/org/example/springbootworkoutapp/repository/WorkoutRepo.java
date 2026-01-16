package org.example.springbootworkoutapp.repository;

import org.example.springbootworkoutapp.entity.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutRepo extends JpaRepository<Workout, Long> {
}
