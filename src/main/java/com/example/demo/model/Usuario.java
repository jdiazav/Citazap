package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
//Lombok Getters y Setters
@Setter
@Getter
@Document(collection = "User")
public class Usuario extends User {
    private List<Cita> agenda = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();

    //constructor inicial

    public Usuario() {
    }
    public Usuario(String nombre, String email, List<Cita> agenda, List<Cliente> clientes) {
        super(nombre, email);
        this.agenda = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }
}