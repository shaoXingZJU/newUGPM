package com.ugpm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ugpm.dao")
public class NewUgpmApplication {
	public static void main(String[] args) {
		SpringApplication.run(NewUgpmApplication.class, args);
	}

}

