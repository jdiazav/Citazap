package com.example.demo.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
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
    //Atributos
    @Id
    @JsonSerialize(using = ToStringSerializer.class)
    private ObjectId id; //ID de la cita (se usa para eliminarlas)
    private ObjectId usuarioId;  // ID del usuario dueño de la cita
    private ObjectId clienteId;  // ID del cliente (opcional)
    private LocalDateTime fechaHora;
    private String descripcion;

    // Constructor vacío y con parámetros
    public Cita(){}

    public Cita(ObjectId usuarioId, ObjectId clienteId, LocalDateTime fechaHora, String descripcion) {
        this.usuarioId = usuarioId;
        this.clienteId = clienteId;
        this.fechaHora = fechaHora;
        this.descripcion = descripcion;
    }

    public Cita(ObjectId usuarioId, LocalDateTime fechaHora, String descripcion) {
        this.usuarioId = usuarioId;
        this.fechaHora = fechaHora;
        this.descripcion = descripcion;
    }
}
