package com.example.krontest.repository;

import com.example.krontest.models.Detail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetailRepository extends JpaRepository<Detail, Long> {
    List<Detail> findDetailByWorkShop(String name);
}
