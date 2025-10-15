package me.theowm.theocurrencyconverter2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/convert")
public class CurrencyController {

    @GetMapping("/sektoeuro")
    public double ConvertToEuro(){
        double euroValue = 11.07;

        return euroValue;
    }

}
