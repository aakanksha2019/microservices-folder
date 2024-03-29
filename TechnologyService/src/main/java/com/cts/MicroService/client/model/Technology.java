package com.cts.MicroService.client.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="technology")
public class Technology {
	@Id 	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String name;
private String description;
public Technology() {
	super();
	// TODO Auto-generated constructor stub
}
public Technology(Long id, String name, String description) {
	super();
	this.id = id;
	this.name = name;
	this.description = description;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}


}
