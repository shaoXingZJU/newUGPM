package com.ugpm;

import com.ugpm.configuration.TestConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class NewUgpmApplication {
	public static void main(String[] args) {
		SpringApplication.run(NewUgpmApplication.class, args);
	}

}

