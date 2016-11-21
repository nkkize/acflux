/**
 * 
 */
package com.acflux.service.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acflux.persistence.entities.User;
import com.acflux.persistence.repositories.UserRespository;

/**
 * @author narenderk
 *
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRespository userRepository;

	@Override
	public User findbyUsername(String username) {
		return userRepository.findByUsername(username);
	}

}
