package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.accp.*"})
public class MyhubApplication {

	public static void main(String[] args) {
		System.out.println("杀杀杀11111222222211111");
		SpringApplication.run(MyhubApplication.class, args);
	}

}
