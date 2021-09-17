package ar.com.ada.mongo.metflix.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.mongo.metflix.entities.Serie;
import ar.com.ada.mongo.metflix.models.response.GenericResponse;
import ar.com.ada.mongo.metflix.services.SerieService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class SerieController {

    @Autowired
    SerieService service;

    @PostMapping(value="/api/series")
    public ResponseEntity<GenericResponse> postSerie(@RequestBody Serie serie) {

        GenericResponse r = new GenericResponse();

        service.grabar(serie);

        r.id = serie.get_id();
        r.isOk = true;
        r.message = "serie ha sido agreada";

        return ResponseEntity.ok(r);


    }

    @GetMapping(value="/api/series")
    public ResponseEntity<List<Serie>> getSeries() {
        return ResponseEntity.ok(service.traerSeries());
    }
    
    
    
}
