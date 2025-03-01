package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

//Lombok Getter y Setter simplifica el codigo
@Setter
@Getter
public abstract class User {
    // Vease que User es una clase abstracta
    @Id
    private String id;
    private String nombre;
    private String email;

    public User() {}

    public User(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

}
