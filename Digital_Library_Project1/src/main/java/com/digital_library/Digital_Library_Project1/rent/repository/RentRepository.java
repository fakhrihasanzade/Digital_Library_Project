package com.digital_library.Digital_Library_Project1.rent.repository;

import com.digital_library.Digital_Library_Project1.rent.entity.Rent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface RentRepository extends JpaRepository<Rent, Long> {

    @Query("SELECT  u.fullName FROM  User u WHERE u.id = :userId")
    String findUserNames(@Param("userId") String userId);

    @Query("SELECT  b.title FROM  Book b WHERE b.id = :bookId")
    String findBookNames(@Param("bookId") String bookId);


    List<Rent> findRentsByUserId(String userId);

    List<Rent> findAllByStartDateBetween(LocalDate beginDate, LocalDate endDate);

//    List<Rent> findByRentalDate(LocalDate rentalDate);

    //Rent findRentByUserIdAndBookName(String userId,String bookName);
}
