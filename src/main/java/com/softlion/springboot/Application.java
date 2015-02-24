package com.softlion.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Getting started to build a web app with Sring Boot.
 */

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {

	public static void main(String[] args) {
		// allow application using Spring Boot defaults to be executed from the command line
		SpringApplication.run(Application.class, args);
	}

}
