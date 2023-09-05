package com.ticketez.dev.discount;

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
@RequestMapping("/api/discount")
public class DiscountAPI {

    @Autowired DiscountDAO discountDAO;

    @GetMapping
    public ResponseEntity<List<Discount>> findAll( ) {
        return ResponseEntity.ok(discountDAO.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Discount> findById(@PathVariable("id") Long id) {
        if (!discountDAO.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(discountDAO.findById(id).get());
    }

    @PostMapping
    public ResponseEntity<Discount> post(@RequestBody Discount discount) {
        discountDAO.save(discount);
        return ResponseEntity.ok(discount);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Discount> put(@PathVariable("id") Long id, @RequestBody Discount discount) {
        if (!discountDAO.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        discountDAO.save(discount);
        return ResponseEntity.ok(discount);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") Long id) {
        discountDAO.deleteById(id);
        return ResponseEntity.ok(true);
    }

}
