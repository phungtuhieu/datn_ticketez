package com.ticketez.dev.cinemaComplex;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaComplexDAO extends JpaRepository <CinemaComplex,Long> {
    
}
