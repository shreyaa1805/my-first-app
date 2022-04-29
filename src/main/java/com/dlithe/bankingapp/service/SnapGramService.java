package com.dlithe.bankingapp.service;

import com.dlithe.bankingapp.dto.SnapGramRegisterResponse;
import org.springframework.stereotype.Component;


@Component
public interface SnapGramService {


    String accountNewRegistration(SnapGramRegisterResponse snapGramRegisterRequest);

    SnapGramRegisterResponse fetchUserDetails(int userId);
}
