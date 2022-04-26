package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
@SpringBootApplication
@RestController
public class DemoApplication {
	@GetMapping("/message")
    public String message() {
    	return("demo application");
    }
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
