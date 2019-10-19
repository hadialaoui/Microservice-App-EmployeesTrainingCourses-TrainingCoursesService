package com.hadialaoui.microservices.trainingCoursesservice.services.dataSeed;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;
import com.hadialaoui.microservices.trainingCoursesservice.entities.TrainingCours;
import com.hadialaoui.microservices.trainingCoursesservice.services.TrainingCoursesService;

@Component
public class DataSeed {
	
	@Autowired
	TrainingCoursesService trainingCoursesService;
	
	@PostConstruct
	public void fillDB() {
		for (int i = 0; i < 3; i++) {
			Faker faker = new Faker();
			trainingCoursesService.saveCours(
             new TrainingCours(faker.educator().course(), faker.educator().campus(), faker.number().toString(), faker.book().genre())
					);
		}
	}
}