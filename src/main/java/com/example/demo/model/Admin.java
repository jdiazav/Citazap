package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "User") // Se almacena en la misma colección que Usuario
public class Admin extends User {
    // Getters y Setters
    private String rol; // Puede ser "superadmin", "moderador", etc.

    // Constructores para Admin
    public Admin() {}
    public Admin(String nombre, String email, String rol) {
        super(nombre, email);
        this.rol = rol;
    }
}
