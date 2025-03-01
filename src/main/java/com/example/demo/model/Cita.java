package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import java.time.LocalDateTime;

@Setter
@Getter
@Document(collection = "citas") // Define la colección en MongoDB
public class Cita{
    @Id
    private String _id;
    private String usuarioId;  // ID del usuario dueño de la cita
    private String clienteId;  // ID del cliente
    private LocalDateTime fechaHora; // Hora de la cita
    private String descripcion; //Descripcion de la cita o servicio

    // Constructor vacío y con parámetros
    public Cita(){}
    public Cita(String usuarioId, String clienteId, LocalDateTime fechaHora, String descripcion) {
        this.usuarioId = usuarioId;
        this.clienteId = clienteId;
        this.fechaHora = fechaHora;
        this.descripcion = descripcion;
    }
}
