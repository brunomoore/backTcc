package com.serv.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.serv.dao.UserRepository;
import com.serv.entities.User;
/** 
 * @author moore bruno
 *
 */
@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public User save(User user) {
		return userRepository.saveAndFlush(user);
	}

	public User update(User user) {
		return userRepository.save(user);
	}

	public User find(String userName) {
		return userRepository.findOneByUsername(userName);
	}

	public User find(Long id) {
		return userRepository.findOne(id);
	}
	
	public User getCurrent() {
		User userAuth = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		return userAuth;
	}
}
