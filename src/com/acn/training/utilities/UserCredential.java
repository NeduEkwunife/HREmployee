package com.acn.training.utilities;

import com.acn.training.model.Role;

public class UserCredential {

	private Long id;
	private String name;
	private Role role;
	private String email;
	
	public UserCredential() {
		this.setName("anonymous");
		this.setRole(null);
		this.setEmail("anonymous");
	}

	public UserCredential(Long id, String name, Role role, String email) {
		// TODO Auto-generated constructor stub
		this.setId(id);
		this.setName(name);
		this.setRole(role);
		this.setEmail(email);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
