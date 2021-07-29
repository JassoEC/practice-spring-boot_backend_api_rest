package com.ecjasso.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "clients")
public class Client implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;
	private String lastName;

	@Column(unique = true)
	private String email;

	@Column(name = "created_at")
	@Temporal(TemporalType.DATE)
	private Date cretedAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getCretedAt() {
		return cretedAt;
	}

	public void setCretedAt(Date cretedAt) {
		this.cretedAt = cretedAt;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
