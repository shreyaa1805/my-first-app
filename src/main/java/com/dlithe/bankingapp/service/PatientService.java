package com.dlithe.bankingapp.service;

import com.dlithe.bankingapp.dto.PatientsDetailRequest;
import org.springframework.stereotype.Component;

@Component
public interface PatientService {
    String registerPerson(PatientsDetailRequest patientsDetailRequest);
}
