package com.ticketez.dev.cinema;

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
@RequestMapping("/api/cinema")
public class CinemaAPI {

         @Autowired
         CinemaDAO cinemaDAO;

         @GetMapping
         public ResponseEntity<List<Cinema>> findAll() {
                  return ResponseEntity.ok(cinemaDAO.findAll());
         }

         @GetMapping("/{id}")
         public ResponseEntity<Cinema> findById(@PathVariable("id") String id) {
                  if (!cinemaDAO.existsById(id)) {
                           return ResponseEntity.notFound().build();
                  }
                  return ResponseEntity.ok(cinemaDAO.findById(id).get());
         }

         @PostMapping
         public ResponseEntity<Cinema> post(@RequestBody Cinema cinema) {
                  cinemaDAO.save(cinema);
                  return ResponseEntity.ok(cinema);
         }

         @PutMapping("/{id}")
         public ResponseEntity<Cinema> put(@PathVariable("id") String id, @RequestBody Cinema cinema) {
                  if (!cinemaDAO.existsById(id)) {
                           return ResponseEntity.notFound().build();
                  }
                  cinemaDAO.save(cinema);
                  return ResponseEntity.ok(cinema);
         }

         @DeleteMapping("/{id}")
         public ResponseEntity<Boolean> delete(@PathVariable("id") String id) {
                  cinemaDAO.deleteById(id);
                  return ResponseEntity.ok(true);
         }

}
