package com.repForge.repForge.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.repForge.repForge.entity.WorkoutSession;

@RestController
public class WorkoutSessionController {
	
	@GetMapping("/getAllWorkoutSessions")
	public List<WorkoutSession> getAllWorkoutSessions() {
		return new ArrayList<>();
	}
}
