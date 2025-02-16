package com.example.demo.model;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import java.time.LocalDateTime;

@Document(collection = "citas") // Define la colección en MongoDB
public class Cita{
    @Id
    private String id;
    private String usuarioId;  // ID del usuario dueño de la cita
    private String clienteId;  // ID del cliente
    private LocalDateTime fechaHora;
    private String descripcion;

    // Constructor vacío y con parámetros
    public Cita() {}
    public Cita(String usuarioId, String clienteId, LocalDateTime fechaHora, String descripcion) {
        this.usuarioId = usuarioId;
        this.clienteId = clienteId;
        this.fechaHora = fechaHora;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getUsuarioId() { return usuarioId; }
    public void setUsuarioId(String usuarioId) { this.usuarioId = usuarioId; }

    public String getClienteId() { return clienteId; }
    public void setClienteId(String clienteId) { this.clienteId = clienteId; }

    public LocalDateTime getFechaHora() { return fechaHora; }
    public void setFechaHora(LocalDateTime fechaHora) { this.fechaHora = fechaHora; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}
