package com.codingshuttle.youtube.hospitalManagementSystem.repository;

import com.codingshuttle.youtube.hospitalManagementSystem.entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
}