/**
 * 
 */
package com.acflux.persistence.entities;

import javax.persistence.Entity;

/**
 * @author narenderk
 *
 */
@SuppressWarnings("serial")
@Entity
public class UserRole extends AbstractAuditableEntity{
	
	private String role;

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

}
