package com.demo.springcoreconcepts;

import com.demo.springcoreconcepts.component.DemoBean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCoreConceptsApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Spring Core Concepts Demo!");
		ApplicationContext context = SpringApplication.run(SpringCoreConceptsApplication.class, args);
		System.out.println("Checking Context: " + context.getBean(DemoBean.class));
	}

}
