package org.example.patientmanaserv.patientManagementservice.repo;

import org.example.patientmanaserv.patientManagementservice.entites.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepo extends JpaRepository<Patient, Long> {
}
