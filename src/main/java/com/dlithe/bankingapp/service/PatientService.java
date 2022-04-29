package com.dlithe.bankingapp.service;

import com.dlithe.bankingapp.dto.PatientsDetailResponse;
import org.springframework.stereotype.Component;

@Component
public interface PatientService {
    String registerPerson(PatientsDetailResponse patientsDetailResponse);
    PatientsDetailResponse getUserDetails(int id);
}
