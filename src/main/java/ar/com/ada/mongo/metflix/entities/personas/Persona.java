package ar.com.ada.mongo.metflix.entities.personas;
import ar.com.ada.mongo.metflix.entities.*;

import java.util.*;

import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "Personas")
public class Persona {

    private List<Serie> series = new ArrayList<>();

    private List<Pelicula> peliculas = new ArrayList<>();
    
    private String nombre;
    
}
