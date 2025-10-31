package com.codingshuttle.youtube.hospitalManagementSystem.service;


import com.codingshuttle.youtube.hospitalManagementSystem.entity.Patient;
import com.codingshuttle.youtube.hospitalManagementSystem.repository.PatientRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor


@Transactional
public class PatientService {

    private final PatientRepository patientRepository;

 //   private final EntityManager entityManager;



    public Patient getPatientById(Long id){

        Patient p1 = patientRepository.findById(id).orElseThrow();

//        Patient p2 = patientRepository.findById(id).orElseThrow();
//
//        System.out.println(p1 == p2);
//
//        p1.setName("Yoyo");

        return p1;

    }
}
