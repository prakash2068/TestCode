package com.Inc.UserManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// @SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
@SpringBootApplication(scanBasePackages = "com.Inc.UserManagement")
@EnableJpaRepositories(basePackages = "com.Inc.UserManagement.Repository")
@ComponentScan({ "com.Inc.UserManagement.Repository", "com.Inc.UserManagement.Service" })
@EnableAutoConfiguration
public class UserManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementApplication.class, args);
	}

}
