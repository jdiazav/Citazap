package com.example.demo.service;

import com.example.demo.repository.MovieRepository;
import com.example.demo.model.Movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired //instanciar automaticamente
    private MovieRepository movieRepository;
    //metodos de acceso a la base de datos
    public List<Movies> allMovies(){
        return movieRepository.findAll(); //metodo de la clase mongoRepository
    }

    public Optional<Movies> findByImdbId(String imdbId){
        //optional por si la pelicula no existe
        return movieRepository.findByImdbId(imdbId);
    }

}
