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
public class Role implements Serializable {
	public Role() {
	}
	
	private int id;
	
	private String name;
	
	private java.util.Set users = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
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
