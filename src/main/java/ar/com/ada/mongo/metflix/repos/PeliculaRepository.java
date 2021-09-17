package ar.com.ada.mongo.metflix.repos;
import ar.com.ada.mongo.metflix.entities.Pelicula;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;


@Repository
public interface PeliculaRepository extends MongoRepository <Pelicula, Object>{
    
}
