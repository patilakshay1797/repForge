package com.repForge.repForge.dto;

import java.time.LocalDate;
import java.time.LocalTime;

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
public class workoutSessionResponseDto {

    private Long id;
    private String notes;
    private LocalDate workoutDate;
    private LocalTime startTime;
    private LocalTime endTime;
}
