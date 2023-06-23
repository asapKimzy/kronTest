package com.example.krontest.repository;

import com.example.krontest.models.Build;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildRepository  extends JpaRepository<Build,Long> {
}
