package ar.com.ada.mongo.metflix.repos;

import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends MongoRepository <Pelicula, Object>{
    
}
