package com.dlithe.bankingapp.controller;

import com.dlithe.bankingapp.dto.PatientsDetailResponse;
import com.dlithe.bankingapp.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PatientsController {
    @Autowired
    private PatientService patientService;

    @PostMapping("register-person")
    public String registerPerson(@RequestBody PatientsDetailResponse patientsDetailResponse) {
        return patientService.registerPerson(patientsDetailResponse);
    }

    @GetMapping("show-patient-details/{id}")
    public PatientsDetailResponse fetchPatient(@PathVariable int id) {

        return patientService.getUserDetails(id);
    }
}
