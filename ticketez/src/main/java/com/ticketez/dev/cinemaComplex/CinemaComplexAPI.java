package com.ticketez.dev.cinemaComplex;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin("*")
@RestController
@RequestMapping("/api/cinemaComplexAPI")
public class CinemaComplexAPI {
    
    
    @Autowired
    CinemaComplexDAO cinemaComplexDAO;

    @GetMapping
    public ResponseEntity<List<CinemaComplex>> findAll( ) {
        return ResponseEntity.ok(cinemaComplexDAO.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CinemaComplex> findById(@PathVariable("id") Long id) {
        if (!cinemaComplexDAO.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(cinemaComplexDAO.findById(id).get());
    }

    @PostMapping
    public ResponseEntity<CinemaComplex> post(@RequestBody CinemaComplex cinemaComplex) {
        cinemaComplexDAO.save(cinemaComplex);
        return ResponseEntity.ok(cinemaComplex);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CinemaComplex> put(@PathVariable("id") Long id, @RequestBody CinemaComplex cinemaComplex) {
        if (!cinemaComplexDAO.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        cinemaComplexDAO.save(cinemaComplex);
        return ResponseEntity.ok(cinemaComplex);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") Long id) {
        cinemaComplexDAO.deleteById(id);
        return ResponseEntity.ok(true);
    }
}
