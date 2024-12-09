package com.digital_library.Digital_Library_Project1.punishment.repository;

import com.digital_library.Digital_Library_Project1.punishment.entity.Punishment;
import com.digital_library.Digital_Library_Project1.rent.entity.Rent;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PunishmentRepository extends JpaRepository<Punishment,Long> {

    @Query("SELECT  r FROM Rent r WHERE r.fineAmount>0 AND r.returnDate<:today")
    List<Rent> findAllRentByReturnDate(@Param("today") LocalDate today);

    @Query("SELECT p FROM Punishment p WHERE p.startDate=:date")
    List<Punishment> findAllPunishmentByStartDate(@Param("date") LocalDate date);

    @Query("SELECT p FROM Punishment p WHERE p.startDate>=:beginDate AND p.startDate<=:endDate")
    List<Punishment> findAllPunishmentStartDateBetween(
            @Param("beginDate") LocalDate beginDate,@Param("endDate") LocalDate endDate
    );

    @Query("SELECT p FROM Punishment p WHERE p.status=:status")
    List<Punishment> findAllPunishmentByStatus(@Param("status") String status);

    @Transactional
    @Modifying
    @Query("DELETE FROM Punishment p WHERE p.status = :status " )
    void deletePunishmentByStatus(@Param("status") String status);


}
