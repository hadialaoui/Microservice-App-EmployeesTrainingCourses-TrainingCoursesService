package com.hadialaoui.microservices.trainingCoursesservice.infrastructure;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hadialaoui.microservices.trainingCoursesservice.entities.TrainingCours;

public interface TrainingCoursRepository extends JpaRepository<TrainingCours, Long>{

	Optional<TrainingCours> findTrainingCoursByTitle(String title);
}
