package com.example.crud.crudoperation;

import com.example.crud.crudoperation.entity.crudoperation;
import com.example.crud.crudoperation.repo.Repository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class CrudOperationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CrudOperationApplication.class, args);
		Repository repo = context.getBean(Repository.class);

//		creating object of crudopertation class
//		crudoperation crud1 = new crudoperation();
//		crud1.setName("Akash Kumar");
//		crud1.setCity("Bokaro");
//		crud1.setStatus("Sales_Associate");
//
//		crudoperation crud2 = new crudoperation();
//		crud2.setName("Prashant");
//		crud2.setCity("UttarPradesh");
//		crud2.setStatus("Placed");
//
//		List<crudoperation> list = List.of(crud1, crud2);
//		Iterable<crudoperation> result =  repo.saveAll(list);
//		result.forEach(pointer->{
//			System.out.println(pointer);
//		});

		Optional<crudoperation> byId = Repository.findById(2);
		crudoperation value = byId.get();
		value.setStatus("Gate Cleared");
		Repository.save(value);
		System.out.println(value);
	}

}
