package com.ticketez.dev.booking;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingDAO extends JpaRepository<Booking, String> {

}
