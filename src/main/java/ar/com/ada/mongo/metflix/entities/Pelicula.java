package ar.com.ada.mongo.metflix.entities;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.aggregation.ConvertOperators.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Getter
@Setter
@Document(collection = "Peliculas")
public class Pelicula extends Contenido {

    @JsonSerialize(using = ToStringSerializer.class) // convertidor a string  ya que _id es Object
    private ObjectId _id;

    private boolean filmadaEnIMAX;
    
}
