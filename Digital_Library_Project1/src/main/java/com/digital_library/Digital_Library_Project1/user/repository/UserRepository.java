package com.digital_library.Digital_Library_Project1.user.repository;

import com.digital_library.Digital_Library_Project1.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
