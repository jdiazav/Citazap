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
    private String cliente;  // ID del cliente (opcional)
    private LocalDateTime fechaHora;
    private String descripcion;

    // Constructor vacío y con parámetros
    public Cita(){}
    public Cita(String cliente, LocalDateTime fechaHora, String descripcion) {
        this.cliente = cliente;
        this.fechaHora = fechaHora;
        this.descripcion = descripcion;
    }
    public Cita(ObjectId usuarioId, LocalDateTime fechaHora, String descripcion) {
        this.fechaHora = fechaHora;
        this.descripcion = descripcion;
    }
}
