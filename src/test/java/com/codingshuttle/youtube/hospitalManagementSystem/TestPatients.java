package com.codingshuttle.youtube.hospitalManagementSystem;


import com.codingshuttle.youtube.hospitalManagementSystem.entity.Patient;
import com.codingshuttle.youtube.hospitalManagementSystem.repository.PatientRepository;
import com.codingshuttle.youtube.hospitalManagementSystem.service.PatientService;
import org.hibernate.query.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;

import java.awt.print.Pageable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
public class TestPatients {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PatientService patientService;


    @Test
    public void testPatientRepository() {

        List<Patient> patientList = patientRepository.findAllPatientWithAppointment();
        System.out.println(patientList);

    }

}
////    @Test
////    public void testTransactionMethods(){
//  //       Patient patient = patientService.getPatientById(1L);
//
//    //    Patient patient = patientRepository.findByName("Arav Sharma");
//
//       // List<Patient> patientList =  patientRepository.findeByNameContaining(LocalDate.of(2003, 10,4),
//       //         "aditibhagat04@gmail.com");
//
//     //   List<Patient> patientList = patientRepository.findByNameContaining("ra");
//
//
//      //  Page<Patient> patientList = patientRepository.findAllPatients(PageRequest.of(1, 2));
//
//
////        for(Patient patient : patientList){
////            System.out.println(patient);
////        }
//    }
//}
