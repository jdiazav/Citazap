package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
//Lombok Getter y Setter simplifica el codigo
@Setter
@Getter
@Document(collection = "User") // Se almacena junto con Admin
public class Usuario extends User {
    // Getters y Setters
    private List<Cita> agenda;
    private List<Cliente> clientes;

    public Usuario() {}

    public Usuario(String nombre, String email, List<Cita> agenda, List<Cliente> clientes) {
        super(nombre, email);
        this.agenda = agenda;
        this.clientes = clientes;
    }

}