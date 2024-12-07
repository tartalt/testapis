package com.spring.patientmanagementservice.web;

import com.spring.patientmanagementservice.entities.Patient;
import com.spring.patientmanagementservice.repositories.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class PatientRestController {

private PatientRepository patientRepository;
@GetMapping(path="/patients")
public List<Patient> patientList() { return patientRepository.findAll(); }
@GetMapping (path ="/patients/{id}")
public Patient patientById(@PathVariable Long id) { return patientRepository.findById(id).orElse(null); }

    @PostMapping(path="/patients")
    public Patient patientById(@RequestBody Patient patient) {
       patientRepository.save(patient);
       return patient;
    }
}
