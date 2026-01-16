package org.example.springbootworkoutapp.repository;

import org.example.springbootworkoutapp.entity.Set;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SetRepo extends JpaRepository<Set, Long> {
}
