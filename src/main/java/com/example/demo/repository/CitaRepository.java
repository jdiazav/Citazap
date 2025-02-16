package com.example.demo.repository;


import com.example.demo.model.Cita;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface CitaRepository extends MongoRepository<Cita, String> {
    List<Cita> findByUsuarioId(String usuarioId);  // Obtener citas por usuario
    List<Cita> findByClienteId(String clienteId);  // Obtener citas por cliente
}
