package com.jpa.JPAlearn;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.jpa.JPAlearn.course.Course;
import com.jpa.JPAlearn.course.courserepo;

@SpringBootApplication
public class JpAlearnApplication {


	public static void main(String[] args) {
		ApplicationContext c=SpringApplication.run(JpAlearnApplication.class, args);
		courserepo cr=c.getBean(courserepo.class);
		Optional<Course> s=cr.findById((long) 1);
		Course c1=s.get();
		c1.setName("java");
		cr.save(c1);
		System.out.println(cr.count());
		
	}
	

}
