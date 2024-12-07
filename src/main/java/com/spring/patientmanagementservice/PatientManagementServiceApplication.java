package com.spring.patientmanagementservice;

import com.spring.patientmanagementservice.entities.Patient;
import com.spring.patientmanagementservice.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PatientManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientManagementServiceApplication.class, args);
	}


	@Bean
	CommandLineRunner start(PatientRepository patientRepository) {
		return args -> {
			patientRepository.save(Patient.builder().name("omar").email("omar@gmail.com").description_diagnostic("HIV").build());
			patientRepository.save(Patient.builder().name("zineb").email("zineb@gmail.com").description_diagnostic("cancer").build());
			patientRepository.save(Patient.builder().name("karim").email("karim@gmail.com").description_diagnostic("ebola").build());

		};
	}
}
