package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies") //decirle que es documento de una coleccion de mongoDB
//las instancias de la clase se almacenan en movies
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movies {
    // atrubutos de pelicula
    @Id //le dice a spring que esto es una id
    private ObjectId id; //id de los objetos (seguro)
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private List<String> genres;
    private String poster;
    private List<String> backdrops;
    @DocumentReference // relacion entre documentos de diferentes colecciones
    private List<Review> reviewIds; // se referencia la coleccion (guarda el id)
}
