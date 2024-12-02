package com.digital_library.Digital_Library_Project1.sale.repository;

import com.digital_library.Digital_Library_Project1.sale.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface SaleRepository extends JpaRepository<Sale,Long> {
}
