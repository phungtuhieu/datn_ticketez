package com.ticketez.dev.paymentInfo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentInfoDAO extends JpaRepository<PaymentInfo, String> {

}
