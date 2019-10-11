package com.cts.trainings.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cts.trainings.model.Trainings;
import com.cts.trainings.service.TrainingsService;
@CrossOrigin(origins="*")
@RestController

public class TrainingsController {
	
	@Autowired
	TrainingsService userService;
	
	@GetMapping("/list")
	public List<Trainings> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping("/{id}")
	public Optional<Trainings> getUserById(@PathVariable Long id) {
		return userService.getUserById(id);
	}
	
	@PostMapping("/posttrainings")
	public List<Trainings> showTrainer(@RequestBody List<Long> list) {
//		System.out.println(list);
		return userService.showtrainer(list);	
	}
	
	@PostMapping("/add")
	public Trainings addUser(@RequestBody Trainings user) {
		return userService.addUser(user);	
	}
	
	@PutMapping("/update")
	public Trainings updateUser(@RequestBody Trainings user) {
		return userService.updateUser(user);
	}
	
	@DeleteMapping("/{id}")
	public String  deleteUser(@PathVariable Long id) {
		 userService.deleteUser(id);
		 return "Deleted Sucessfully";
	}
	@GetMapping("/current/{id}")
	public List<Trainings> showcurrent(@PathVariable Long id) {
		System.out.println(id);
		return userService.showcurrent(id);
	}
	@GetMapping("/completed/{userId}")
	public List<Trainings> showcompleted(@PathVariable Long userId) {
		return userService.showcompleted(userId);
	}
	

}

