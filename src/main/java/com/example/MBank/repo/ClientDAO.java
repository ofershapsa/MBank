package com.example.MBank.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class ClientDAO {

	@Autowired
	private ClientRepository repo;

	public void addClient(Client client) {
		repo.save(client);

	}

	public void delete(long id) {
		repo.delete(id);
	}

	public Iterable<Client> selectAll() {

		return repo.findAll();
	}

	public Client findClient(long id) {

		return repo.findOne(id);
	}

	public void update(long id) {
		Client client = findClient(id);
		repo.save(client);
	}
}
