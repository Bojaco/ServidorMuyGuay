package com.example.juego;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface Repository extends MongoRepository<Juego, String> {
    List<Juego> findAll();
    List<Juego> findByNombre(String nombre);

}
