package com.example.demo.repository;


import com.example.demo.model.Cita;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface CitaRepository extends MongoRepository<Cita, ObjectId> {
    List<Cita> findByUsuarioId(ObjectId usuarioId);  // Obtener citas por usuario
    List<Cita> findByClienteId(ObjectId clienteId);  // Obtener citas por cliente
}
