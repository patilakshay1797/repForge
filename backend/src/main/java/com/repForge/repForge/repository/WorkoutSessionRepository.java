package com.repForge.repForge.repository;

import org.springframework.stereotype.Repository;
import com.repForge.repForge.entity.WorkoutSession;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface WorkoutSessionRepository extends JpaRepository<WorkoutSession, Long>{
}
