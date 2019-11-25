package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private String name;
	private String grade;
	private int marks;
	
	public Student() {
		super();
		System.out.println("Object Created");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public void show() {
		System.out.println("hello");
		
	}
	
	
	

}
