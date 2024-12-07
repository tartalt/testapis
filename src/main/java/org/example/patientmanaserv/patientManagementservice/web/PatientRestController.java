package org.example.patientmanaserv.patientManagementservice.web;

import lombok.AllArgsConstructor;
import org.example.patientmanaserv.patientManagementservice.entites.Patient;
import org.example.patientmanaserv.patientManagementservice.repo.PatientRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class PatientRestController {
    private PatientRepo patientRepo;
    @GetMapping("/patients")
    public List<Patient> patientList() {
        return patientRepo.findAll();
    }
    @GetMapping("/patients/{id}")
    public Patient patientById(@PathVariable Long id) {
        return patientRepo.findById(id).get();
    }
    @PostMapping("/patients")
    public Patient patientById(@RequestBody Patient patient) {
        patientRepo.save(patient);
        return patient;
    }

}
