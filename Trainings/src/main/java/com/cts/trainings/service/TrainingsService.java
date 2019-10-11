package com.cts.trainings.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.trainings.model.Trainings;
import com.cts.trainings.repository.TrainingsRepository;


	@Service
	public class TrainingsService {
	
		
		@Autowired
		TrainingsRepository userRepo;
		
		@Transactional
		public List<Trainings> getAllUsers(){
			return (List<Trainings>) userRepo.findAll();
		}
		
		@Transactional
		public List<Trainings> showtrainer(List<Long> list){
			
			return  userRepo.findBymentorIdIn(list);
		}
		
		@Transactional
		public Optional<Trainings> getUserById(Long id) {
			return userRepo.findById(id);
		}
		
		@Transactional
		public Trainings addUser(Trainings user) {
			return userRepo.save(user);
		}
		
		@Transactional
		public Trainings updateUser(Trainings user) {
			return userRepo.save(user);
		}
		
		@Transactional
		public void deleteUser(Long id) {
			userRepo.deleteById(id);
		}
		@Transactional
		public List<Trainings> showcurrent(Long userId) {
			
			return userRepo.showcurrent(userId);
		}
		@Transactional
		public List<Trainings> showcompleted(Long userId) {
			return (List<Trainings>)userRepo.showcompleted(userId);
		}
			
		
}