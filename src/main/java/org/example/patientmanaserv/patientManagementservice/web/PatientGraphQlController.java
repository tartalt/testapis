package org.example.patientmanaserv.patientManagementservice.web;

import lombok.AllArgsConstructor;
import org.example.patientmanaserv.patientManagementservice.dtos.PatientDto;
import org.example.patientmanaserv.patientManagementservice.entites.Patient;
import org.example.patientmanaserv.patientManagementservice.mapper.PatientMapper;
import org.example.patientmanaserv.patientManagementservice.repo.PatientRepo;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientGraphQlController {
    private final PatientRepo patientRepo;
    private final PatientMapper patientMapper;

    @QueryMapping
    public List<Patient> allpatient() {
        return patientRepo.findAll();
    }
    @QueryMapping
    public Patient patientById(@Argument Long id) {
        Patient patient = patientRepo.findById(id).orElse(null);
        if (patient == null) { throw new RuntimeException(String.format("Patient with id %s not found", id)); }
        return patient;
    }
    @MutationMapping
    public Patient savePatient(@Argument PatientDto patientDto) {
    Patient c=patientMapper.fromPatientDtoPatientEntity(patientDto);
    return patientRepo.save(c);
    }
}
