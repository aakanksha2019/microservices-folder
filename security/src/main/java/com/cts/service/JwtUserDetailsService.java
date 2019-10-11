package com.cts.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.cts.repository.UserDao;
import com.cts.model.DAOUser;
import com.cts.model.UserDTO;

@Service
public class JwtUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserDao userDao;

	@Autowired
	private PasswordEncoder bcryptEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		DAOUser user = userDao.findByUsername(username);
		if (user == null) {
			
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		System.out.println(user.getUsername()+"works");
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
				new ArrayList<>());
	}
	public Boolean checkusername(String email) {
		return userDao.existsByUsername(email);
	}
	public DAOUser save(DAOUser user) {
	
		
		user.setPassword(bcryptEncoder.encode(user.getPassword()));
		return userDao.save(user);
	}
}