package ar.com.ada.mongo.metflix.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Serie")
public class Serie extends Contenido {
    
}
