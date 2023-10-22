package com.start.akash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AkashApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(AkashApplication.class, args);
		UserRepo userRepo= context.getBean(UserRepo.class);

		SalesEntity sale = new SalesEntity();
		sale.setName("Ravi Ranjan");
		sale.setCity("Bokaro");
		sale.setStatus("Java Developer");

		SalesEntity sale1 = userRepo.save(sale);
		System.out.println(sale1);

	}

}
