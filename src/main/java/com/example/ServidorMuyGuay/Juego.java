package com.example.ServidorMuyGuay;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Document(collection = "Juegos")

public class Juego {
    @Id
    private String id;
    @NotBlank(message= "Nombre obligatorio")
    private String nombre;
    @Min(1)
    @Max(5)
    private int dificultad;
    private int numeroJugadores;
    @NotBlank(message= "Diseñador obligatorio")
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
    public void setId(String id) {this.id = id;}
    public void setNombre(String nombre) {this.nombre =nombre;}
    public void setDificultad(int dificultad) {this.dificultad =dificultad;}
    public void setNumeroJugadores(int numeroJugadores) {this.numeroJugadores =numeroJugadores;}
    public void setDesigner(String designer) {this.designer =designer;}
    public void setTipo(String tipo){this.tipo =tipo;}
}
