package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

//@Scope(value="prototype")
public class Student {
	
	private String name;
	private String grade;
	private int marks;
	@Autowired
	@Qualifier("BookObj")
	private Book book;
	
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
	
	
	
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public void show() {
		System.out.println("Student entered...!");
		book.read();
		
	}
	
	
	

}
