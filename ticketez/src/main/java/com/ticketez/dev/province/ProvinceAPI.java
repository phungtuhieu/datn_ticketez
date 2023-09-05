package com.ticketez.dev.province;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/province")
public class ProvinceAPI {
    

    
    @Autowired
	private ProvinceDAO provinceDAO;


     @GetMapping
    public ResponseEntity<List<Province>> findAll( ) {
        return ResponseEntity.ok(provinceDAO.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Province> findById(@PathVariable("id") Long id) {
        if (!provinceDAO.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(provinceDAO.findById(id).get());
    }

    @PostMapping
    public ResponseEntity<Province> post(@RequestBody Province province) {
        provinceDAO.save(province);
        return ResponseEntity.ok(province);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Province> put(@PathVariable("id") Long id, @RequestBody Province province) {
        if (!provinceDAO.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        provinceDAO.save(province);
        return ResponseEntity.ok(province);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") Long id) {
        provinceDAO.deleteById(id);
        return ResponseEntity.ok(true);
    }
    
}
