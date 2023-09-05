package com.ticketez.dev.province;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceDAO extends JpaRepository<Province,Long> {
    
}
