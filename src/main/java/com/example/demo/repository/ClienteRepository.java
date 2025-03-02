package com.example.demo.repository;

import com.example.demo.model.Cliente;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ClienteRepository extends MongoRepository<Cliente, ObjectId> {
}