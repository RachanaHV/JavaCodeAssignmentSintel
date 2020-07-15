package com.java.code.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class JavaCodeAssignmentSingtelApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaCodeAssignmentSingtelApplication.class, args);
	}

}
