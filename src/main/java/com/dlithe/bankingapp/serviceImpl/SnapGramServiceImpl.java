package com.dlithe.bankingapp.serviceImpl;

import com.dlithe.bankingapp.Entity.SnapGramUserLogin;
import com.dlithe.bankingapp.Repository.SnapGramUserLoginDAO;
import com.dlithe.bankingapp.dto.SnapGramRegisterResponse;
import com.dlithe.bankingapp.service.SnapGramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SnapGramServiceImpl implements SnapGramService {
    @Autowired
    private SnapGramUserLoginDAO snapGramUserLoginDAO;


    @Override
    public String accountNewRegistration(SnapGramRegisterResponse snapGramRegisterRequest) {
        SnapGramUserLogin snapGramUserLogin=new SnapGramUserLogin();
        snapGramUserLogin.setUserName(snapGramRegisterRequest.getUserName());
        snapGramUserLogin.setUserAge(snapGramRegisterRequest.getUserAge());
        snapGramUserLogin.setUserEmailId(snapGramRegisterRequest.getUserEmailId());
        snapGramUserLoginDAO.save(snapGramUserLogin);
        return "Instagram user registered successfully";
    }

    @Override
    public SnapGramRegisterResponse fetchUserDetails(int userId) {
        Optional <SnapGramUserLogin> snapGramUserLogin=snapGramUserLoginDAO.findById(userId);
        SnapGramRegisterResponse snapGramRegisterResponse=new SnapGramRegisterResponse();
        SnapGramUserLogin snapGram=snapGramUserLogin.get();
        snapGramRegisterResponse.setUserName(snapGram.getUserName());
        snapGramRegisterResponse.setUserAge(snapGram.getUserAge());
        snapGramRegisterResponse.setUserEmailId(snapGram.getUserEmailId());
        return snapGramRegisterResponse;

    }


}
