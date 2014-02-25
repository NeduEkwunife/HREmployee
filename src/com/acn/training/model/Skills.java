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
public class Skills implements Serializable {
	public Skills() {
	}
	
	private long id;
	
	private String skill_name;
	
	private java.util.Set users = new java.util.HashSet();
	
	private java.util.Set projects = new java.util.HashSet();
	
	private void setId(long value) {
		this.id = value;
	}
	
	public long getId() {
		return id;
	}
	
	public long getORMID() {
		return getId();
	}
	
	public void setSkill_name(String value) {
		this.skill_name = value;
	}
	
	public String getSkill_name() {
		return skill_name;
	}
	
	public void setUsers(java.util.Set value) {
		this.users = value;
	}
	
	public java.util.Set getUsers() {
		return users;
	}
	
	
	public void setProjects(java.util.Set value) {
		this.projects = value;
	}
	
	public java.util.Set getProjects() {
		return projects;
	}
	
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
