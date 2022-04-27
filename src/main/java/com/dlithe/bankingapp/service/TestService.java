package com.dlithe.bankingapp.service;

import org.springframework.stereotype.Component;

@Component
public interface TestService {
    String fetchDetails(String product);
}
