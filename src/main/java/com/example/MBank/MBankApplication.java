package com.example.MBank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.MBank.repo.ClientDAO;

@SpringBootApplication

public class MBankApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MBankApplication.class, args);

		ClientDAO repo = context.getBean(ClientDAO.class);
		// Client c= new Client();

		// c.setName("dani levi");
		// c.setAge(23);

		// repo.addClient(c);
		// repo.delete(2);
		System.out.println("its working!!!!!!!!!!");
		repo.selectAll().forEach(e -> System.out.println(e.getId() + " " + e.getName() + " " + e.getAge()));
		// Client client= repo.findClient(7);
		// client.setId(client.getId());
		// client.setName("ran kal");
		// client.setAge(40);
		// repo.update(client);
	}
}
