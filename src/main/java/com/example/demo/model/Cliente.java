package com.example.demo.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

//Lombok Getter y Setter simplifica el codigo
@Setter
@Getter
public class Cliente {
    //Getters y Setters
    @Id
    private String id; // ID del cliente (cambiar por ObjectID)
    private String nombre; // Nombre del cliente
    private String email; // Email del cliente
    private String telefono; // Telefono del cliente

    //Constructor vacio y con 3 paramatros (ID se pone arbitrariamente)
    public Cliente() {}
    public Cliente(String nombre, String email, String telefono) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

}
