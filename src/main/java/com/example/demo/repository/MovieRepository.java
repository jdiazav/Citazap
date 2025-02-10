package com.example.demo.repository;

import com.example.demo.model.Movies;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//decimos que tipo de dato y tipo de id tendremos
@Repository
public interface MovieRepository extends MongoRepository<Movies, ObjectId> {
    Optional<Movies> findByImdbId(String imdbId);
}
