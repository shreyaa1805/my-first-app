package com.dlithe.bankingapp.controller;

import com.dlithe.bankingapp.dto.PatientDetailRequest;
import com.dlithe.bankingapp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("show-details/{product}")
    public String showProduct(@PathVariable String product) {
        return testService.fetchDetails(product);
    }
 @PostMapping("register-patient")
    public String registerNewPatient(@RequestBody PatientDetailRequest patientDetailRequest){
        return testService.registerPatient(patientDetailRequest);
 }

}
