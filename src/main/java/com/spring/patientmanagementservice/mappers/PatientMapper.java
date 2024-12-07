package com.spring.patientmanagementservice.mappers;


import com.spring.patientmanagementservice.stubs.PatientServiceOuterClass;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.spring.patientmanagementservice.dtos.PatientDto;
import com.spring.patientmanagementservice.entities.Patient;

@Component
public class PatientMapper {

    private final ModelMapper modelMapper = new ModelMapper();

    // Mapper PatientDto vers Patient
    public Patient fromPatientDtoToPatientEntity(PatientDto patientDto) {
        return modelMapper.map(patientDto, Patient.class);
    }

    // Mapper Patient vers PatientDto (si nécessaire)
    public PatientDto fromPatientEntityToPatientDto(Patient patient) {
        return modelMapper.map(patient, PatientDto.class);
    }

    public PatientServiceOuterClass.Patient fromPatientEntityToPatientGrpc(Patient patient) {
        // Map fields from the JPA entity to the gRPC message
        return PatientServiceOuterClass.Patient.newBuilder().setId(patient.getId()).build();





    }

}