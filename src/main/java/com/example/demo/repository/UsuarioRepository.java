package com.example.demo.repository;

import com.example.demo.model.Usuario;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, ObjectId> {
    /* Permite traer los datos de usuarios */
}