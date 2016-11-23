/**
 * 
 */
package com.acflux.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author narenderk
 *
 */
@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter{
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry){
		registry.addViewController("/").setViewName("login");
        //registry.addViewController("/login").setViewName("login");
        registry.addViewController("/aboutus").setViewName("aboutus");
        registry.addViewController("/termsConditions").setViewName("termsConditions");
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/admin").setViewName("admin");
        registry.addViewController("/admin/management").setViewName("management");		
	}

}
