package com.dlithe.bankingapp.controller;

import com.dlithe.bankingapp.dto.PatientsDetailRequest;
import com.dlithe.bankingapp.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientsController {
    @Autowired
    private PatientService patientService;

    @PostMapping("register-person")
    public String registerPerson(@RequestBody PatientsDetailRequest patientsDetailRequest){
        return patientService.registerPerson(patientsDetailRequest);
    }
}
