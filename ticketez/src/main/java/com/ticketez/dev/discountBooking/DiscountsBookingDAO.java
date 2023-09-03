package com.ticketez.dev.discountBooking;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountsBookingDAO extends JpaRepository<DiscountsBooking, DiscountsBookingPK> {

}
