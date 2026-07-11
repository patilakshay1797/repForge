package com.repForge.repForge.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/welcome")
public class Welcome {
	
	@GetMapping
	public String welcomeApi() {
		return "Welcome to Rep Forge, Build Strength. Track Progress.";
	}
}
