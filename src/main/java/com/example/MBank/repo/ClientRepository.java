package com.example.MBank.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

public interface ClientRepository extends CrudRepository<Client,Long> {
 
}
