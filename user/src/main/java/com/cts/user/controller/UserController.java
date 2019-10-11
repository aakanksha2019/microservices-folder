package com.cts.user.controller;

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

import com.cts.user.model.User;
import com.cts.user.service.UserService;
@CrossOrigin(origins="*")
@RestController()

public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/list")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping("/{id}")
	public Optional<User> getUserById(@PathVariable Long id) {
		return userService.getUserById(id);
	}
	
	@PostMapping("/add")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);	
	}
	
	@PutMapping("/update")
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	
	@DeleteMapping("/{id}")
	public String  deleteUser(@PathVariable Long id) {
		 userService.deleteUser(id);
		 return "Deleted Sucessfully";
	}
	
	@GetMapping("block/{id}")
	public int blockUser(@PathVariable Long id) {
		return userService.block(id);
//		userService.updateUser(user);
	}
	@GetMapping("unblock/{id}")
	public int unblockUser(@PathVariable Long id) {
		return userService.unblock(id);
//		userService.updateUser(user);
	}
}
