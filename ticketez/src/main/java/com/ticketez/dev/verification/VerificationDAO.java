package com.ticketez.dev.verification;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationDAO extends JpaRepository<Verification,Long> {
    
}
