package org.example.patientmanaserv.patientManagementservice.mapper;

import org.example.patientmanaserv.patientManagementservice.dtos.PatientDto;
import org.example.patientmanaserv.patientManagementservice.entites.Patient;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class PatientMapper {
    private ModelMapper modelMapper = new ModelMapper();
    public Patient fromPatientDtoPatientEntity(PatientDto patientDto) {
        Patient patient = modelMapper.map(patientDto, Patient.class);
        return patient;
    }
}
