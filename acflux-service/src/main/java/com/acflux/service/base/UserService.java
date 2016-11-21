/**
 * 
 */
package com.acflux.service.base;

import org.springframework.stereotype.Service;

import com.acflux.persistence.entities.User;

/**
 * @author narenderk
 *
 */
@Service
public interface UserService {
	public User findbyUsername(String username);
}
