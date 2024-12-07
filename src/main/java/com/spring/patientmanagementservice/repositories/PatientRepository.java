package com.spring.patientmanagementservice.repositories;

import com.spring.patientmanagementservice.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
