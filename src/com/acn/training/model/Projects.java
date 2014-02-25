/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package com.acn.training.model;

import java.io.Serializable;
public class Projects implements Serializable {
	public Projects() {
	}
	
	private long id;
	
	private String name;
	
	private String client_name;
	
	private java.util.Set skills = new java.util.HashSet();
	
	private java.util.Set users = new java.util.HashSet();
	
	private void setId(long value) {
		this.id = value;
	}
	
	public long getId() {
		return id;
	}
	
	public long getORMID() {
		return getId();
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setClient_name(String value) {
		this.client_name = value;
	}
	
	public String getClient_name() {
		return client_name;
	}
	
	public void setSkills(java.util.Set value) {
		this.skills = value;
	}
	
	public java.util.Set getSkills() {
		return skills;
	}
	
	
	public void setUsers(java.util.Set value) {
		this.users = value;
	}
	
	public java.util.Set getUsers() {
		return users;
	}
	
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
