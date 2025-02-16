package com.example.demo.model;

import org.springframework.data.annotation.Id;

public abstract class User {
    @Id
    private String id;
    private String nombre;
    private String email;

    public User() {}

    public User(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    // Getters y Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
