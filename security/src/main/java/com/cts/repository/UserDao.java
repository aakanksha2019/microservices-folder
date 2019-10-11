package com.cts.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.cts.model.DAOUser;

public interface UserDao extends CrudRepository<DAOUser, Long>{
	
	 DAOUser findByUsername(String email);
	 Boolean existsByUsername(String email);
}
