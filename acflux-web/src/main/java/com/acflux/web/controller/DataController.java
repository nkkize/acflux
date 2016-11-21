/**
 * 
 */
package com.acflux.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acflux.persistence.entities.User;
import com.acflux.service.base.UserService;

/**
 * @author narenderk
 *
 */
@RestController
public class DataController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/hello")
	public User getUser(){
		return userService.findbyUsername("");
	}

}
