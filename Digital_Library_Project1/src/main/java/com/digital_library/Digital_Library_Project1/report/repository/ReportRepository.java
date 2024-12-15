package com.digital_library.Digital_Library_Project1.report.repository;

import com.digital_library.Digital_Library_Project1.report.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface ReportRepository extends JpaRepository<Report,Long> {

    @Query("SELECT SUM(p.price) FROM Punishment p WHERE p.startDate=:date")
    Double findAllPunishmentPriceByDate(@Param("date") LocalDate date);

    @Query("SELECT SUM(s.price) FROM Sale s WHERE s.saleDate=:date")
    Double findAllSalePriceByDate(@Param("date") LocalDate date);

}
