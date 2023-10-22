package com.start.akash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AkashApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AkashApplication.class, args);
		UserRepo userRepo = context.getBean(UserRepo.class);
		Sales user = new Sales();
		user.setName("Akash Kumar");
		user.setAddress("Jharkhand");
		user.setCity("Let's go");

		Sales user1 = userRepo.save(user);
		System.out.println(user1);
	}

}
