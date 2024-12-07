package org.example.patientmanaserv.patientManagementservice.web;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import org.example.patientmanaserv.patientManagementservice.dtos.PatientDto;
import org.example.patientmanaserv.patientManagementservice.entites.Patient;
import org.example.patientmanaserv.patientManagementservice.mapper.PatientMapper;
import org.example.patientmanaserv.patientManagementservice.repo.PatientRepo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
@WebService
public class PatientSoapService {
    private PatientRepo patientRepo;
    private PatientMapper patientMapper;

    public List<Patient> patientList() {
        return patientRepo.findAll();
    }
    @WebMethod
    public Patient patientById(@WebParam(name = "id" ) Long id) {
        return patientRepo.findById(id).get();
    }
    @WebMethod
    public Patient savePatient(@WebParam(name = "patient" ) PatientDto patientDto) {
        Patient patient = patientMapper.fromPatientDtoPatientEntity(patientDto);
        return patientRepo.save(patient);
    }

}
