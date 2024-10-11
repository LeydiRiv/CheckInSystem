package com.example.CheckInSystem.repository;


import com.example.CheckInSystem.model.CheckIn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckinRepository extends JpaRepository<CheckIn, Long> {
}
