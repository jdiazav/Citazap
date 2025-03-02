package com.example.demo.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

//Lombok Getters y Setters
@Setter
@Getter
public abstract class User {
    // Vease que User es una clase abstracta
    @Id
    @JsonSerialize(using = ToStringSerializer.class)
    private String id;
    private String nombre;
    private String email;

    //Constructores (necesarios para user)
    public User() {}
    public User(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
}
