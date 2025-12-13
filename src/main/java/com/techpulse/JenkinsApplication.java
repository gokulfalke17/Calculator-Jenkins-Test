package com.techpulse;

import com.techpulse.service.Calculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsApplication.class, args);

        Calculator calculator = new   Calculator();
        System.out.println("Addition: " + calculator.add(5, 10));
        System.out.println("Subtraction: " + calculator.subtract(10, 5));
        System.out.println("Multiplication: " + calculator.multiply(5, 10));
        System.out.println("Division: " + calculator.divide(10, 2));
	}

}
