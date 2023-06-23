package com.example.krontest.repository;

import com.example.krontest.models.AirCraft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirCraftRepository extends JpaRepository<AirCraft,Long> {
}
