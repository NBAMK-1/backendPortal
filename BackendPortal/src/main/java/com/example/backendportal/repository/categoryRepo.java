package com.example.backendportal.repository;


import com.example.backendportal.entity.category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface categoryRepo extends JpaRepository<category,Integer> {
}
