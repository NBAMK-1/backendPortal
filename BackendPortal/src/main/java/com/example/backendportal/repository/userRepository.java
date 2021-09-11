package com.example.backendportal.repository;

import com.example.backendportal.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<User,Long> {


}
