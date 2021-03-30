package com.example.ServidorMuyGuay;
import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

@Document(collection = "Juegos")

public class Juego {
    @Id
    private String id;
    private String nombre;
    private int dificultad;
    private int numeroJugadores;
    private String designer;
    private String tipo;
    public Juego (String nombre,int dificultad,int numeroJugadores,String designer,String tipo)
    {
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.numeroJugadores = numeroJugadores;
        this.designer = designer;
        this.tipo = tipo;
    }
    public String getId() {return id;}
    public String getNombre() {return nombre;}
    public int getDificultad() {return dificultad;}
    public int getNumeroJugadores() {return numeroJugadores;}
    public String getDesigner() {return designer;}
    public String getTipo() {return tipo;}
}
