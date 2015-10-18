package com.abhi.bankapp.domain;

public class User {
	
	private long userId;
	
	private int age;
	
	private String firstName;
	
	private String lastName;
	
	public User(){
		
	}
	
	public User(long userId, int age, String firstName, String lastName) {
		this.userId = userId;
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString(){
		return "userId: " + userId + 
				" age: " + age +
				" firstName: " + firstName +
				" lastName: " + lastName;
	}
	
}
