/**
 * 
 */
package com.acflux.web.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.acflux.web.entry.DataWS;

/**
 * @author narenderk
 *
 */
@Configuration
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(DataWS.class);
	}

}
