package com.dlithe.bankingapp.serviceImpl;

import com.dlithe.bankingapp.Entity.Patients;
import com.dlithe.bankingapp.Repository.PatientsDAO;
import com.dlithe.bankingapp.dto.PatientsDetailRequest;
import com.dlithe.bankingapp.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class PatientsServiceImpl implements PatientService {

    @Autowired
    private PatientsDAO patientsDAO;
    @Override
    public String registerPerson(PatientsDetailRequest patientsDetailRequest) {
        Patients patients=new Patients();
        patients.setName(patientsDetailRequest.getName());
        patients.setAge(patientsDetailRequest.getAge());
        patientsDAO.save(patients);
        return "Patient registered successfully";
    }

    @Override
    public PatientsDetailRequest getUserDetails(int id) {
        Optional<Patients> patient = patientsDAO.findById(id);
        PatientsDetailRequest patientsDetailRequest=new PatientsDetailRequest();
        patientsDetailRequest.setName(patient.get().getName());
        patientsDetailRequest.setAge(patient.get().getAge());
        return patientsDetailRequest;
    }
}
