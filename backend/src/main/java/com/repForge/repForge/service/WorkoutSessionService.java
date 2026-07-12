package com.repForge.repForge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repForge.repForge.dto.workoutSessionRequestDto;
import com.repForge.repForge.entity.WorkoutSession;
import com.repForge.repForge.repository.WorkoutSessionRepository;
import com.repForge.repForge.utils.BeanCopyUtil;

@Service
public class WorkoutSessionService {

	@Autowired
	private WorkoutSessionRepository workoutSessionRepo;

	public String createWorkoutSession(WorkoutSession workSess) {
		WorkoutSession obj = workoutSessionRepo.save(workSess);
		if (obj != null)
			return "Workout Session saved";
		else
			return "Failed to save Workout Session";
	}

	public List<WorkoutSession> getAllWorkouts() {

		return workoutSessionRepo.findAll();
	}

	public void deleteWorkoutSession(Long id) {
		workoutSessionRepo.deleteById(id);
	}

	public void updateWorkoutSession(Long id, workoutSessionRequestDto sessDto) {
		WorkoutSession workout = workoutSessionRepo.findById(id)
				.orElseThrow(() -> new RuntimeException("Workout not found"));

		BeanCopyUtil.copyNonNullProperties(sessDto, workout);

		workoutSessionRepo.save(workout);
	}
}
