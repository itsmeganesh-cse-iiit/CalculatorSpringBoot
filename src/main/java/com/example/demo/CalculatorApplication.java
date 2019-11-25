package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
@Scope(value="prototype")
public class CalculatorApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(CalculatorApplication.class, args);
		Student s = context.getBean(Student.class);
		s.show();
		
		Student s1 = context.getBean(Student.class);
		s1.show();
		
		System.out.println("Spring boot Application.");
	}

}
