package com.demo.springcoreconcepts;

import com.demo.springcoreconcepts.component.DemoBean;
import com.demo.springcoreconcepts.component.EmployeeBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCoreConceptsApplication {
	public static final Logger logger = LoggerFactory.getLogger(SpringCoreConceptsApplication.class);

	public static void main(String[] args) {
		logger.debug("Welcome to Spring Core Concepts!");
		ApplicationContext context = SpringApplication.run(SpringCoreConceptsApplication.class, args);
		logger.debug("Checking Context: {}", context.getBean(DemoBean.class));
		logger.debug("\n*** Example Using @Autowire annotation on property ***");
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setEmpId(136);
		employeeBean.setEmpName("Spring Framework Guru");
		employeeBean.showEmployeeDetails();
	}

}
