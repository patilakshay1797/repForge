package com.repForge.repForge.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.repForge.repForge.entity.Exercise;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class workoutSessionRequestDto {

    private String notes;
    private LocalDate workoutDate;
    private LocalTime startTime;
    private LocalTime endTime;
    private List<Exercise> exercises;
}