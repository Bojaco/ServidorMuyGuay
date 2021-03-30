package com.example.ServidorMuyGuay;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.ServidorMuyGuay.JuegoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PepejucionController {
    @Autowired
    private JuegoRepository repository;
    @GetMapping("/juegos")
    public ResponseEntity<List<Juego>> getAllJuegos(@RequestParam(required = false) String name) {
        List<Juego> juegos = new ArrayList<Juego>();
        if (name==null) {
        repository.findAll().forEach(juegos::add);}
        else {
            repository.findByNombre(name).forEach(juegos::add);
        }
        if (juegos.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(juegos,HttpStatus.OK);
    }
    @GetMapping("/juegos/{id}")
    public ResponseEntity<Juego> getById(@PathVariable("id") String id) {
        Optional<Juego> giocco = null;
        giocco = repository.findById(id);
        if (giocco.isPresent()) {
            return new ResponseEntity<>(giocco.get(), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
}
