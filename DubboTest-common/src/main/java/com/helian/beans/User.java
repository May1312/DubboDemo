package com.helian.beans;

import java.io.Serializable;

public class User implements Serializable{
	private static final long serialVersionUID = -8654579648161791305L;
	private String name;
	private int age;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void run(){
		System.out.println(".............");
	}
	
}
