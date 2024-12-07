package com.spring.patientmanagementservice.web;


import com.spring.patientmanagementservice.dtos.PatientDto;
import com.spring.patientmanagementservice.entities.Patient;
import com.spring.patientmanagementservice.mappers.PatientMapper;
import com.spring.patientmanagementservice.repositories.PatientRepository;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
@WebService
public class PatientSoapService {
    private final PatientRepository patientRepository;
    private final PatientMapper patientMapper;


    @WebMethod
    public List<Patient> patientList() {
        return patientRepository.findAll(); // Récupère tous les patients
    }

    @WebMethod
    public Patient patientById(@WebParam(name = "id") Long id) {
        return patientRepository.findById(id).orElse(null); // Trouve un patient par ID
    }

    @WebMethod
    public Patient savePatient(@WebParam(name = "patient") PatientDto patientDto) {
        // Convertit PatientDto en Patient
        Patient patient = patientMapper.fromPatientDtoToPatientEntity(patientDto);

        // Sauvegarde le patient et retourne l'entité persistée
        return patientRepository.save(patient);
    }
}
