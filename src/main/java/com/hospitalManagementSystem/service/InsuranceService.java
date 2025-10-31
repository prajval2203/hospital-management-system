package com.hospitalManagementSystem.service;


import com.hospitalManagementSystem.entity.Insurance;
import com.hospitalManagementSystem.entity.Patient;
import com.hospitalManagementSystem.repository.InsuranceRepository;
import com.hospitalManagementSystem.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InsuranceService {

    private final PatientRepository patientRepository;
    private final InsuranceRepository insuranceRepository;


    @Transactional
    public Patient assignInsuranceToPatient(Insurance insurance, Long patientId){

        Patient patient = patientRepository.findById(patientId)
                .orElseThrow(() -> new IllegalArgumentException("Patient Not found with ID: " +patientId));

        patient.setInsurance(insurance);

        insurance.setPatient(patient);  //for Bidirectional Consistency Maintainance.

        return patient;
    }

    @Transactional
    public Patient dissociateInsuranceFromPatient(Long patientId){
        Patient patient = patientRepository.findById(patientId)
                .orElseThrow(() -> new IllegalArgumentException("Patient Not found with ID: " +patientId));

        patient.setInsurance(null);

        return patient;

    }

}
