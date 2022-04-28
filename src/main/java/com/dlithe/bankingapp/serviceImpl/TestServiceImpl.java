package com.dlithe.bankingapp.serviceImpl;

import com.dlithe.bankingapp.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Override
    public String fetchDetails(String product) {
        switch (product) {
            case "Computer":
                return "MacBook";
            case "Mouse":
                return "Dell";
            case "Speaker":
                return "JBL";
            default:
                return "Not a product";
        }
    }


}
