package com.thienphuc.backend_java_core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.thienphuc.backend_java_core.repository")
public class BackendJavaCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendJavaCoreApplication.class, args);
	}

}
