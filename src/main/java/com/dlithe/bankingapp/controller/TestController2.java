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

    @GetMapping("show-addition/{number1}/{number2}")
    public int showAddition(@PathVariable int number1, @PathVariable int number2) {
        return number1 + number2;
    }

    @GetMapping("show-operation/{number1}")
    public String showOperation(@PathVariable int number1) {
        if (number1 % 2 == 0) {
            return "Even Number";
        } else
            return "Odd Number";
    }

    @GetMapping("show-name/{name}")
    public String showName(@PathVariable String name) {
        try {
            return "Hey" + " " + name;
        } catch (NumberFormatException e) {
            return "Not a string";
        }
    }

}


