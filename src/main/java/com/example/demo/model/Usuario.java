package com.example.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "users") // Se almacena junto con Admin
public class Usuario extends User {
    private List<Cita> agenda;
    private List<Cliente> clientes;

    public Usuario() {}

    public Usuario(String nombre, String email, List<Cita> agenda, List<Cliente> clientes) {
        super(nombre, email);
        this.agenda = agenda;
        this.clientes = clientes;
    }

    // Getters y Setters
    public List<Cita> getAgenda() { return agenda; }
    public void setAgenda(List<Cita> agenda) { this.agenda = agenda; }

    public List<Cliente> getClientes() { return clientes; }
    public void setClientes(List<Cliente> clientes) { this.clientes = clientes; }
}