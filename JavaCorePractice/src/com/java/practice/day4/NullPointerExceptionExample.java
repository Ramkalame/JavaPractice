package com.java.practice.day4;

public class NullPointerExceptionExample {
	
	private String name;
	private int age;
	private String gender;
	
	public NullPointerExceptionExample(String name, int age, String gender) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		
	}
	
	public NullPointerExceptionExample() {
		// TODO Auto-generated constructor stub
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		
		
		return name;
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
