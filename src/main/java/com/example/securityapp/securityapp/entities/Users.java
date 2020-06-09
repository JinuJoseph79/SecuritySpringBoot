package com.example.securityapp.securityapp.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {

	@Id
	private Long id;
	private String username;
	private String password;
	private int enabled;
	
	@ManyToMany(cascade=CascadeType.MERGE)
    @JoinTable(
       name="user_role",
       joinColumns={@JoinColumn(name="user_id", referencedColumnName="ID")},
       inverseJoinColumns={@JoinColumn(name="role_id", referencedColumnName="ID")})
    private List<Role> role;
	
	
	public int getEnabled() {
		return enabled;
	}
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String user) {
		this.username = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Role> getRoles() {
		return role;
	}
	public void setRoles(List<Role> role) {
		this.role = role;
	}

	
	
}
