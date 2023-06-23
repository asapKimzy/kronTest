package com.example.krontest.repository;

import com.example.krontest.models.Assembly;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssemblyRepository extends JpaRepository<Assembly, Long> {
}
