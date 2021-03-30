package com.example.ServidorMuyGuay;
import com.example.ServidorMuyGuay.Juego;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface JuegoRepository extends MongoRepository<Juego, String> {
    List<Juego> findAll();
    List<Juego> findByNombre(String nombre);

}
