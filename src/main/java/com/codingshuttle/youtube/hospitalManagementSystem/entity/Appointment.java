package com.codingshuttle.youtube.hospitalManagementSystem.entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime appointmentTime;

    @Column(length = 500)
    private String reason;

    @ManyToOne
    @ToString.Exclude       //partially we aare writing it
    @JoinColumn(name = "patient_id", nullable = false)      //Patient is required and not nullable.
    private Patient patient;

    //Doctor can survive without appointment but the appointment can't survive without the doctor. So Appointment is the Owning Side

    @ManyToOne(fetch = FetchType.LAZY)
    @ToString.Exclude           // partially we aare writing it
    @JoinColumn(nullable = false)
    private Doctor doctor;
}
