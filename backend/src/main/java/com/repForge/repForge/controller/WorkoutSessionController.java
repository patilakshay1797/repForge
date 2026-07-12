package com.repForge.repForge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.repForge.repForge.dto.workoutSessionRequestDto;
import com.repForge.repForge.entity.WorkoutSession;
import com.repForge.repForge.service.WorkoutSessionService;

@RestController
public class WorkoutSessionController {

	@Autowired
	private WorkoutSessionService workService;

	@GetMapping("/getAllWorkoutSessions")
	public List<WorkoutSession> getAllWorkoutSessions() {
		return workService.getAllWorkouts();
	}

	@PostMapping("/workOutSession")
	public String createWorkoutSession(@RequestBody WorkoutSession workSess) {
		return workService.createWorkoutSession(workSess);
	}

	@DeleteMapping("/workoutSession/delete/{id}")
	public ResponseEntity<String> deleteWorkoutSession(@PathVariable Long id) {
		workService.deleteWorkoutSession(id);
		return ResponseEntity.ok("Deleted Succesfully...");
	}

	@PatchMapping("/workoutSession/{id}")
	public ResponseEntity<String> updateWorkoutSession(@PathVariable Long id,
			@RequestBody workoutSessionRequestDto sessDto) {
		try {
			workService.updateWorkoutSession(id, sessDto);
			return ResponseEntity.ok("Updated workout session successfully");

		} catch (Exception e) {
			return ResponseEntity.status(500).body("Failed to update workout session!");
		}

	}
}
