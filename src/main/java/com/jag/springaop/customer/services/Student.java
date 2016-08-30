package com.jag.springaop.customer.services;

public class Student {

	private String name;
	private String id;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void printName() {
		System.out.println("Student name : " + this.name);
	}

	public void printID() {
		System.out.println("Student ID : " + this.id);
	}

	public void printThrowException() {
		throw new IllegalArgumentException();
	}

	
}
