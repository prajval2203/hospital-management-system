package com.codingshuttle.youtube.hospitalManagementSystem.repository;

import com.codingshuttle.youtube.hospitalManagementSystem.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}