package com.example;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@SpringBootApplication
public class SonarqubedemoApplication {

	public static final String test_a = new String();
	 
	@RequestMapping("/")
    String home() {
		List<String> collection1 = null;
		collection1.clear();
        return "Hello World!";
    }
	public static void main(String[] args) {
		SpringApplication.run(SonarqubedemoApplication.class, args);
	}
}
