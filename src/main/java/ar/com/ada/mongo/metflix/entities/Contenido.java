package ar.com.ada.mongo.metflix.entities;

import java.util.*;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import org.bson.types.ObjectId;

import ar.com.ada.mongo.metflix.entities.personas.Actor;
import ar.com.ada.mongo.metflix.entities.personas.Director;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contenido {

    @JsonSerialize(using = ToStringSerializer.class) // convertidor a string  ya que _id es Object
    private ObjectId _id;

    private String nombre;

    private Genero genero;

    private IdiomaEnum idiomaOrigen;

    private Integer añoLanzamiento;

    private Integer duracion;

    public List<Actor> actores = new ArrayList<>();

    public List <Director> directores = new ArrayList<>();


    public enum IdiomaEnum {
        ESPANOL(1), INGLES(2), ITALIANO(3), FRANCES(4), RUSO(5);

        private final Integer value;

        private IdiomaEnum(Integer value) {
            this.value = value;
        }

        public Integer getValue() {
            return value;
        }

        public static IdiomaEnum parse(Integer id) {
            IdiomaEnum status = null;
            for (IdiomaEnum item : IdiomaEnum.values()) {
                if (item.getValue().equals(id)) {
                    status = item;
                    break;
                }
            }
            return status;
        }
    }


    
}
