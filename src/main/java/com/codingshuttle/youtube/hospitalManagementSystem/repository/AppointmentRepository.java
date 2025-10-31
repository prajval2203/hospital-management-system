package com.codingshuttle.youtube.hospitalManagementSystem.repository;

import com.codingshuttle.youtube.hospitalManagementSystem.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}