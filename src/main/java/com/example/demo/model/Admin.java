package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "User") // Se almacena en la misma colección que Usuario
public class Admin extends User {
    private String rol;
    // Constructores para Admin
    public Admin() {}
}
