package com.ticketez.dev.price;

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
@RequestMapping("/api/price")
public class PriceAPI {
    @Autowired
    PriceDAO priceDAO;

    @GetMapping
    public ResponseEntity<List<Price>> findAll() {
        return ResponseEntity.ok(priceDAO.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Price> findById(@PathVariable("id") Long id) {
        if (!priceDAO.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(priceDAO.findById(id).get());
    }

    @PostMapping
    public ResponseEntity<Price> post(@RequestBody Price price) {
        priceDAO.save(price);
        return ResponseEntity.ok(price);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Price> put(@PathVariable("id") Long id, @RequestBody Price price) {
        if (!priceDAO.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        priceDAO.save(price);
        return ResponseEntity.ok(price);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") Long id) {
        priceDAO.deleteById(id);
        return ResponseEntity.ok(true);
    }
}
