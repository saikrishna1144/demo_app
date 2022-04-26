package com.example.demo;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
@SpringBootApplication
@RestController
public class DemoApplication {
	static Logger log = LogManager.getLogger(DemoApplication.class.getName());  
	@GetMapping("/message")
    public String message() {
           log.debug("Hello this is a debug message");  
	      log.info("Hello this is an info message"); 
    	return("demo application second commit");}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
