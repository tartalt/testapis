package com.spring.patientmanagementservice.web;


import com.spring.patientmanagementservice.dtos.PatientDto;
import com.spring.patientmanagementservice.entities.Patient;
import com.spring.patientmanagementservice.mappers.PatientMapper;
import com.spring.patientmanagementservice.repositories.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientGraphQlController {
    private final PatientRepository patientRepository;
    private final PatientMapper patientMapper;

    @QueryMapping
    public List<Patient> AllPatients() {return patientRepository.findAll();}
    @QueryMapping
    public Patient patientById(@Argument Long id){
        Patient patient = patientRepository.findById(id).orElse(null);
        if(patient == null) throw new RuntimeException("Patient not found");
        return patient;
    }

    @MutationMapping
    public Patient savePatient(@Argument PatientDto patientDto) {
        Patient c = patientMapper.fromPatientDtoToPatientEntity(patientDto);
        return patientRepository.save(c);
    }
}

// localhost:8083/graphiql?path=/graphql
