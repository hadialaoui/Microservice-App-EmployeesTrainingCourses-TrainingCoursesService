package com.hadialaoui.microservices.trainingCoursesservice.services;

import java.util.List;

import com.hadialaoui.microservices.trainingCoursesservice.entities.TrainingCours;

public interface TrainingCoursesService {
	TrainingCours findCoursByTitle(String title);
    List<TrainingCours> findAllCours();
    TrainingCours saveCours(TrainingCours cours);
    TrainingCours updateCours(Long id, TrainingCours cours);
    void deleteCours(Long id);
}
