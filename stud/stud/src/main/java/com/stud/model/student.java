package com.stud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class student {
	private int id;
	private String name;
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + "]";
	}
	

}
