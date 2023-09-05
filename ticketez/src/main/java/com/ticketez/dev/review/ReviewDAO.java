package com.ticketez.dev.review;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewDAO extends JpaRepository<Review,Long> {
    
}
