package ar.com.ada.mongo.metflix.entities;


import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Getter
@Setter
@Document(collection = "Peliculas")
public class Pelicula extends Contenido {

   

    private boolean filmadaEnIMAX;
    
}
