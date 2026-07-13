package com.repForge.repForge.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.List;

import org.junit.jupiter.api.Test;

class WorkoutSessionTest {

    @Test
    void setExercisesShouldLinkEachExerciseToTheWorkoutSession() {
        WorkoutSession workoutSession = new WorkoutSession();
        Exercise exercise = new Exercise();

        workoutSession.setExercises(List.of(exercise));

        assertEquals(1, workoutSession.getExercises().size());
        assertSame(workoutSession, exercise.getWorkoutSession());
    }
}
