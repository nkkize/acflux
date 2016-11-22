/**
 * 
 */
package com.acflux.web.entry;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

/**
 * @author narenderk
 *
 */
@Component
@Path("/")
public class DataWS {
	
	@GET
	@Produces(value = MediaType.TEXT_PLAIN)
	@Path("/test")
	public String createUser() {
		return "Data from DataWS";
	}
}
