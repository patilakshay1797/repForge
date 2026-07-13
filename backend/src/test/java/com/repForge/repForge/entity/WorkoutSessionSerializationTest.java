package com.repForge.repForge.entity;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

class WorkoutSessionSerializationTest {

    @Test
    void shouldSerializeWorkoutSessionWithoutRecursiveWorkoutSessionReferences() throws Exception {
        WorkoutSession workoutSession = new WorkoutSession();
        workoutSession.setNotes("Upper body");

        Exercise exercise = new Exercise();
        exercise.setExerciseName("Bench Press");
        exercise.setMuscleGroup("Chest");

        workoutSession.addExercise(exercise);

        String json = new ObjectMapper().writeValueAsString(workoutSession);

        assertTrue(json.contains("Bench Press"));
        assertFalse(json.contains("\"workoutSession\""));
    }
}
