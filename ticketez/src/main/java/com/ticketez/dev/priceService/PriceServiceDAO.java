package com.ticketez.dev.priceService;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceServiceDAO extends JpaRepository<PriceService, Long> {

}
