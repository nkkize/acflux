/**
 * 
 */
package com.acflux.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author narenderk
 *
 */
@RestController
public class LoginController {
	
	@RequestMapping("/welcome")
	public String welcome(){
		return "welcome";
	}

}
