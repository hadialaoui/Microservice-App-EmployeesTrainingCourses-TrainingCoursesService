package com.hadialaoui.microservices.trainingCoursesservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hadialaoui.microservices.trainingCoursesservice.entities.TrainingCours;
import com.hadialaoui.microservices.trainingCoursesservice.infrastructure.TrainingCoursRepository;

@Service
public class TrainingCoursesserviceImpl implements TrainingCoursesService{

	@Autowired
	TrainingCoursRepository trainingCoursRepository;
	@Override
	public TrainingCours findCoursByTitle(String title) {
		Optional<TrainingCours> trainingCours = trainingCoursRepository.findTrainingCoursByTitle(title);
	      if(!trainingCours.isPresent())
	    	  throw new RuntimeException("This cours doesn't exist");
			return trainingCours.get();
	}

	@Override
	public List<TrainingCours> findAllCours() {
		return trainingCoursRepository.findAll();
	}

	@Override
	public TrainingCours saveCours(TrainingCours cours) {
		return trainingCoursRepository.save(cours);
	}

	@Override
	public TrainingCours updateCours(Long id, TrainingCours cours) {
		TrainingCours trainingCours = trainingCoursRepository.findById(id).get();
		trainingCours.setTitle(cours.getTitle());
		trainingCours.setDescription(cours.getDescription());
		trainingCours.setNumberOfHours(cours.getNumberOfHours());
		trainingCours.setTopics(cours.getTopics());
		return trainingCoursRepository.save(trainingCours);
	}

	@Override
	public void deleteCours(Long id) {
		TrainingCours trainingCours = trainingCoursRepository.findById(id).get();
		trainingCoursRepository.delete(trainingCours);
	}

}
