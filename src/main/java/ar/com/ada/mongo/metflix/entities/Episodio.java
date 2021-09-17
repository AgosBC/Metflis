package ar.com.ada.mongo.metflix.entities;

import java.util.*;

import ar.com.ada.mongo.metflix.entities.personas.Actor;
import ar.com.ada.mongo.metflix.entities.personas.Director;

public class Episodio {

    private String nombre;
    private Integer numero;
    private Integer duracion; // en minutos
    private Director director;
    private List<Actor> actores = new ArrayList<>();
    private String sinopsis;
    
}
