package com.dac.studentApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.SpringVersion;

@SpringBootApplication
@ComponentScan("com.dac")
public class StudentAppApplication {

	public static void main(String[] args) {
		 System.out.println("version: " + SpringVersion.getVersion());
		SpringApplication.run(StudentAppApplication.class, args);
	}

}
