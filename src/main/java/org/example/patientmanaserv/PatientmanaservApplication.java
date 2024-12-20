package org.example.patientmanaserv;

import org.example.patientmanaserv.patientManagementservice.entites.Patient;
import org.example.patientmanaserv.patientManagementservice.repo.PatientRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PatientmanaservApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientmanaservApplication.class, args);
    }
    @Bean
    CommandLineRunner start(PatientRepo repository) {
        return args -> {
            repository.save(Patient.builder().name("zineb").email("zineb@gmail.com").description_diagnostic("Check-up").build());
            repository.save(Patient.builder().name("mohamed").email("mohamed@gmail.com").description_diagnostic("Sacnner").build());
            repository.save(Patient.builder().name("yassine").email("yassine@gmail.com").description_diagnostic("Analysis").build());
            repository.save(Patient.builder().name("rayane").email("rayane@gmail.com").description_diagnostic("Check-up").build());
        };
    }


}
