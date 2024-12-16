package com.restaurant.entities;

import java.time.LocalDateTime;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long id ;
	
	
	private String firstname;

	private String lastname;

	private String email;
	private String password;
	private String phone;
	private Role role;
	@CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;
	public enum Role {
	    ADMIN,
	    STUDENT,
	    EMPLOYE
	}
	
	public User(String firstname, String lastname, String email, String password, String phone, Role role) {
	    super();
	    this.firstname = firstname;  // Utiliser 'this' pour faire référence à la variable d'instance
	    this.lastname = lastname;    // Utiliser 'this' pour faire référence à la variable d'instance
	    this.email = email;
	    this.password = password;
	    this.phone = phone;
	    this.role = role;
	}

	public User() {
		super();
	}
	public Long getId() {
		return id;
	}

	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
	    this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}

  
	@Override
	public String toString() {
		return "User [id=" + id + ", Firstname=" + firstname + ", Lastname=" + lastname + ", email=" + email
				+ ", password=" + password + ", phone=" + phone + ", role=" + role + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + "]";
	}
	
	
}