package com.spring.patientmanagementservice.configuration;



import lombok.AllArgsConstructor;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.patientmanagementservice.web.PatientSoapService;


@AllArgsConstructor
@Configuration
public class CxfConfig {

    private final Bus bus;
    private final PatientSoapService patientSoapService;


    @Bean
    public EndpointImpl endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, patientSoapService);
        endpoint.publish("/PatientManagementService");
        return endpoint;
    }
}
