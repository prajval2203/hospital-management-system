package com.hospitalManagementSystem.service;

import com.hospitalManagementSystem.entity.Appointment;
import com.hospitalManagementSystem.entity.Doctor;
import com.hospitalManagementSystem.entity.Patient;
import com.hospitalManagementSystem.repository.AppointmentRepository;
import com.hospitalManagementSystem.repository.DoctorRepository;
import com.hospitalManagementSystem.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointmentService {

    private final PatientRepository patientRepository;
    private final DoctorRepository doctorRepository;
    private final AppointmentRepository appointmentRepository;


    @Transactional
    public Appointment createNewAppointment(Appointment appointment, Long doctorId, Long patientId){

        Doctor doctor = doctorRepository.findById(doctorId).orElseThrow();
        Patient patient= patientRepository.findById(patientId).orElseThrow();

        if(appointment.getId() != null) throw new IllegalArgumentException("Appointment Should not have present earlier(updatable to my understanding)");

        appointment.setPatient(patient);
        appointment.setDoctor(doctor);

        patient.getAppointments().add(appointment);     //to maintain consistency.

      return appointmentRepository.save(appointment);
    }

    @Transactional
    public Appointment reAssignAppointmentToAnotherDoctor(Long appointmentId, Long doctorId){

        Appointment appointment = appointmentRepository.findById(appointmentId).orElseThrow();
        Doctor doctor = doctorRepository.findById(doctorId).orElseThrow();

        appointment.setDoctor(doctor);  //this will automatically call the doctor because it is Dirty.

        doctor.getAppointments().add(appointment);

        return appointment;

    }
}
