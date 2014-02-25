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
public class Users implements Serializable {
	public Users() {
	}
	
	private long id;
	
	private String firstname;
	
	private String lastname;
	
	private String email;
	
	private String password;
	
	private Byte enabled = new Byte("1");
	
	private com.acn.training.model.Role role;
	
	private String picture;
	
	private String summary;
	
	private Boolean available;
	
	private com.acn.training.model.Projects projects;
	
	private java.util.Set skills = new java.util.HashSet();
	
	private void setId(long value) {
		this.id = value;
	}
	
	public long getId() {
		return id;
	}
	
	public long getORMID() {
		return getId();
	}
	
	public void setFirstname(String value) {
		this.firstname = value;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setLastname(String value) {
		this.lastname = value;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setEnabled(byte value) {
		setEnabled(new Byte(value));
	}
	
	public void setEnabled(Byte value) {
		this.enabled = value;
	}
	
	public Byte getEnabled() {
		return enabled;
	}
	
	public void setPicture(String value) {
		this.picture = value;
	}
	
	public String getPicture() {
		return picture;
	}
	
	public void setSummary(String value) {
		this.summary = value;
	}
	
	public String getSummary() {
		return summary;
	}
	
	public void setAvailable(boolean value) {
		setAvailable(new Boolean(value));
	}
	
	public void setAvailable(Boolean value) {
		this.available = value;
	}
	
	public Boolean getAvailable() {
		return available;
	}
	
	public void setRole(com.acn.training.model.Role value) {
		this.role = value;
	}
	
	public com.acn.training.model.Role getRole() {
		return role;
	}
	
	public void setProjects(com.acn.training.model.Projects value) {
		this.projects = value;
	}
	
	public com.acn.training.model.Projects getProjects() {
		return projects;
	}
	
	public void setSkills(java.util.Set value) {
		this.skills = value;
	}
	
	public java.util.Set getSkills() {
		return skills;
	}
	
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
