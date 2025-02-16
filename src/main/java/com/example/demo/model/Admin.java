package com.example.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users") // Se almacena en la misma colección que Usuario
public class Admin extends User {
    private String rol; // Puede ser "superadmin", "moderador", etc.

    public Admin() {}

    public Admin(String nombre, String email, String rol) {
        super(nombre, email);
        this.rol = rol;
    }

    // Getters y Setters
    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }
}
