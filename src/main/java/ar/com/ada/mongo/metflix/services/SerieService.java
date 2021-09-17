package ar.com.ada.mongo.metflix.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.mongo.metflix.entities.Serie;
import ar.com.ada.mongo.metflix.repos.SerieRepository;

@Service
public class SerieService {

    @Autowired
    SerieRepository repo;

    public void grabar(Serie serie) {

        repo.save(serie);
    }

    public List<Serie> traerSeries() {
        return repo.findAll();
    }
    
}
