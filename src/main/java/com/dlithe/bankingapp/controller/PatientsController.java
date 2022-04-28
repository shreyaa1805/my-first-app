package com.dlithe.bankingapp.controller;

import com.dlithe.bankingapp.dto.PatientsDetailRequest;
import com.dlithe.bankingapp.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PatientsController {
    @Autowired
    private PatientService patientService;

    @PostMapping("register-person")
    public String registerPerson(@RequestBody PatientsDetailRequest patientsDetailRequest) {
        return patientService.registerPerson(patientsDetailRequest);
    }

    @GetMapping("showPatient/{id}")
    public PatientsDetailRequest fetchPatient(@PathVariable int id) {
        return patientService.getUserDetails(id);
    }
}
