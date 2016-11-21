/**
 * 
 */
package com.acflux.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.acflux.persistence.entities.User;

/**
 * @author narenderk
 *
 */
@Repository
@Transactional
public interface UserRespository extends JpaRepository<User, Long>{
	
	public User findByUsername(String username);
}
