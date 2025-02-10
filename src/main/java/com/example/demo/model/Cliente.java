package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "clientes") //decirle que es documento de una coleccion de mongoDB
//las instancias de la clase se almacenan en movies
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    ObjectId id;
    String nombre;
    String telefono;
    String email;
    String descripcion;
}
