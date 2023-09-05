package com.ticketez.dev.serviceBooking;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceBookingDAO extends JpaRepository<ServiceBooking, ServiceBookingPK> {

}
