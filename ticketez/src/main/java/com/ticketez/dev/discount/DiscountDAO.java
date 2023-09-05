package com.ticketez.dev.discount;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountDAO extends JpaRepository<Discount,Long> {
    
}
