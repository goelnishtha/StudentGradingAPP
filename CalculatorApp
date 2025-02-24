package com.example.calculator.controllers;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
public class CalculatorApp {

    @PostMapping("/add")
    public int add(@RequestBody Map<String, String> data){
        int firstNumber = Integer.parseInt(data.get("FirstNumber"));
        int secondNumber = Integer.parseInt(data.get("SecondNumber"));
        return firstNumber + secondNumber;
    }

    @PostMapping("/subtract")
    public int subtract(@RequestBody Map<String, String> data){
        int firstNumber = Integer.parseInt(data.get("FirstNumber"));
        int secondNumber = Integer.parseInt(data.get("SecondNumber"));
        return firstNumber - secondNumber;
    }

    @PostMapping("/multiply")
    public int multiply(@RequestBody Map<String, String> data){
        int firstNumber = Integer.parseInt(data.get("FirstNumber"));
        int secondNumber = Integer.parseInt(data.get("SecondNumber"));
        return firstNumber * secondNumber;
    }

    @PostMapping("/divide")
    public String divide(@RequestBody Map<String, String> data){
        int firstNumber = Integer.parseInt(data.get("FirstNumber"));
        int secondNumber = Integer.parseInt(data.get("SecondNumber"));
        if(secondNumber == 0){
            return "Division by zero is not allowed";
        }
        return String.valueOf((double) firstNumber / secondNumber);
    }
}
