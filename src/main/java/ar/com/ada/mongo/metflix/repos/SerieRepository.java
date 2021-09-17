package ar.com.ada.mongo.metflix.repos;
import ar.com.ada.mongo.metflix.entities.Serie;

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface SerieRepository extends MongoRepository <Serie, Object>{
    
}
