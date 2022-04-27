package com.dlithe.bankingapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController2 {
    @GetMapping("fetch-dish-details/{dishName}")
    public String showDishDetails(@PathVariable String dishName) {
        switch (dishName) {
            case "Spaghetti":
                return showSpaghetti();
            case "Chinese":
                return showChinese();
            case "Macaroni":
                return showMacaroni();
            default:
                return ("No such dish available");
        }
    }

    public String showSpaghetti() {
        return "Pleasant smell!";
    }

    public String showChinese() {
        return "Great food";
    }

    public String showMacaroni() {
        return "Great taste!";
    }
}
