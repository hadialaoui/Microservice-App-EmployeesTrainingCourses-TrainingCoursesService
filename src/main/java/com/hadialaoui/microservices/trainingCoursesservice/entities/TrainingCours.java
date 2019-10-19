package com.hadialaoui.microservices.trainingCoursesservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TrainingCours {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  private String description;
  private String numberOfHours;
  private String topics;
  
  
	public TrainingCours() {
	super();
    }
	public TrainingCours(String title, String description, String numberOfHours, String topics) {
	super();
	this.title = title;
	this.description = description;
	this.numberOfHours = numberOfHours;
	this.topics = topics;
    }
	public TrainingCours(Long id, String title, String description, String numberOfHours, String topics) {
	super();
	this.id = id;
	this.title = title;
	this.description = description;
	this.numberOfHours = numberOfHours;
	this.topics = topics;
    }
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getNumberOfHours() {
		return numberOfHours;
	}
	public void setNumberOfHours(String numberOfHours) {
		this.numberOfHours = numberOfHours;
	}
	public String getTopics() {
		return topics;
	}
	public void setTopics(String topics) {
		this.topics = topics;
	}
  
  
}
