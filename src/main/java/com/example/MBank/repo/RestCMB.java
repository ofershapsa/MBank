package com.example.MBank.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCMB {

	@Autowired
	private ClientRepository repo;

	@CrossOrigin
	@RequestMapping("/getAll")
	public Iterable<Client> selectAll() {

		return repo.findAll();
	}

	@CrossOrigin
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public @ResponseBody void delete(@PathVariable("id") long id) {
		Client client = repo.findOne(id);
		repo.delete(client.getId());

	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public @ResponseBody Client findClient(@PathVariable(value = "id") long id) {

		return repo.findOne(id);
	}

	@CrossOrigin
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public void addClient(@RequestBody Client client) {

		repo.save(client);

	}

	@Transactional
	@CrossOrigin
	@RequestMapping(value = "/update/{id}/{name}/{age}", method = RequestMethod.PUT)
	public void update(@PathVariable long id, @PathVariable String name, @PathVariable Integer age) {
		Client client = findClient(id);
		client.setName(name);
		client.setAge(age);
		// repo.save(client);
	}
}
