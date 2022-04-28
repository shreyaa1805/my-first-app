package com.dlithe.bankingapp.service;

import com.dlithe.bankingapp.dto.PatientDetailRequest;
import org.springframework.stereotype.Component;

@Component
public interface TestService {
    String fetchDetails(String product);
String registerPatient(PatientDetailRequest patientDetailRequest);

}
