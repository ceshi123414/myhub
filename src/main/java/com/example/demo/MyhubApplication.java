package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.accp*"})
public class MyhubApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyhubApplication.class, args);
	}

}
