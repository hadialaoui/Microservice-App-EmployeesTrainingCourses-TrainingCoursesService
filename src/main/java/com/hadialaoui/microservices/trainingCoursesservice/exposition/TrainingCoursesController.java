package com.hadialaoui.microservices.trainingCoursesservice.exposition;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hadialaoui.microservices.trainingCoursesservice.entities.TrainingCours;
import com.hadialaoui.microservices.trainingCoursesservice.services.TrainingCoursesService;

@RequestMapping("/trainingCourses")
@RestController
public class TrainingCoursesController {
	@Autowired
	Environment environment;
	@Autowired
	private TrainingCoursesService trainingCoursesService;
	
	
	@PostMapping(value="")
	public void addTrainingCours(@RequestBody TrainingCours trainingCours){
		trainingCoursesService.saveCours(trainingCours);
	}
	
	@GetMapping(value="/{title}")
	public TrainingCours getTrainingCoursByTitle(@PathVariable String title){
		environment.getProperty("local.server.port");
		return trainingCoursesService.findCoursByTitle(title);
	}
	
	@GetMapping(value="/port")
	public String getPort(){
		return "port of service training courses : "+environment.getProperty("local.server.port");
	}
	
	@GetMapping(value="")
	public List<TrainingCours> getAllTrainingCours(){
		return trainingCoursesService.findAllCours();
	}

	
	@PutMapping(value="/{id}")
	public TrainingCours updateTrainingCours(@PathVariable Long id ,@RequestBody TrainingCours trainingCours){
		return trainingCoursesService.updateCours(id, trainingCours);
	}
	
	@DeleteMapping(value="/{id}")
	public void deleteTrainingCours(@PathVariable Long id){
		 trainingCoursesService.deleteCours(id);
	}
	
}
