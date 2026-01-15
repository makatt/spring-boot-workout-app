package org.example.springbootworkoutapp.repository;

import org.example.springbootworkoutapp.entity.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepo extends JpaRepository<Exercise,Long> {
}
