package ar.com.ada.mongo.metflix.repos;

import org.springframework.stereotype.Repository;

@Repository
public interface SerieRepository extends MongoRepository <Serie, Object>{
    
}
