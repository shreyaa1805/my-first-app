package com.dlithe.bankingapp.Repository;

import com.dlithe.bankingapp.Entity.Patients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface PatientsDAO extends JpaRepository<Patients,Integer>{

    }

