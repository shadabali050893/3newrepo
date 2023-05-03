package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories //no need to write now days this
@EntityScan            //no need to write now days this
@SpringBootApplication   //only write this ,is sufficient
public class Application {

	public static void main(String[] args) {
		System.out.println("i am crud-4 program");
		SpringApplication.run(Application.class, args);
	}

}
