/**
 * 
 */
package com.acflux.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout,
			HttpServletRequest request) {
		ModelAndView model = new ModelAndView();
		if (logout != null) {
			model.addObject("msg", "logged out successfully.");
		}
		if (error != null) {
			model.addObject("error", "wrong username or password.");
		}
		model.setViewName("login");
		return model;
	}

}
