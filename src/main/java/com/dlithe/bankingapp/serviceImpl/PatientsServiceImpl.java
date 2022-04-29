package com.dlithe.bankingapp.serviceImpl;

import com.dlithe.bankingapp.Entity.Patients;
import com.dlithe.bankingapp.Repository.PatientsDAO;
import com.dlithe.bankingapp.dto.PatientsDetailResponse;
import com.dlithe.bankingapp.dto.ReviewResponse;
import com.dlithe.bankingapp.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class PatientsServiceImpl implements PatientService {

    @Autowired
    private PatientsDAO patientsDAO;

    @Override
    public String registerPerson(PatientsDetailResponse patientsDetailResponse) {
        Patients patients = new Patients();
        patients.setName(patientsDetailResponse.getName());
        patients.setAge(patientsDetailResponse.getAge());
        patientsDAO.save(patients);
        return "Patient registered successfully";
    }

    @Override
    public PatientsDetailResponse getUserDetails(int id) {
        ReviewResponse reviewResponse = new ReviewResponse();
        List<ReviewResponse> reviewResponseList = new ArrayList<>();

        Optional<Patients> patient = patientsDAO.findById(id);
        PatientsDetailResponse patientsDetailResponse = new PatientsDetailResponse();

        patientsDetailResponse.setName(patient.get().getName());
        patientsDetailResponse.setAge(patient.get().getAge());

        reviewResponse.setReviewerName("shreya");
        reviewResponse.setReview("great");
        reviewResponse.setRating("5");
        reviewResponseList.add(reviewResponse);

        ReviewResponse reviewResponse1 = new ReviewResponse();
        reviewResponse1.setReviewerName("Riya");
        reviewResponse1.setReview("Good hospitality");
        reviewResponse1.setRating("4");
        reviewResponseList.add(reviewResponse1);


        patientsDetailResponse.setReview(reviewResponseList);
        return patientsDetailResponse;
    }
}
