package com.example.krontest.repository;

import com.example.krontest.models.PKI;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PKIRepository extends JpaRepository<PKI, Long> {
    List<PKI> findPKIByManufacturer(String name);
}
