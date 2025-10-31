package com.hospitalManagementSystem;


import com.hospitalManagementSystem.entity.Patient;
import com.hospitalManagementSystem.repository.PatientRepository;
import com.hospitalManagementSystem.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
