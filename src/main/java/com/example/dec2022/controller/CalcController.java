package com.example.dec2022.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Calc")
public class CalcController {
 @GetMapping("/add/{first}/{second}")
    public double add(@PathVariable("first") double firstNum,
                     @PathVariable("second") double secondNum){
 return firstNum+secondNum;

    }
    @GetMapping("/sub/{first}/{second}")
    public double sub(@PathVariable("first") double firstNum,
                      @PathVariable("second") double secondNum){
        return firstNum-secondNum;

    }
    @GetMapping("/mul/{first}/{second}")
    public double mul(@PathVariable("first") double firstNum,
                      @PathVariable("second") double secondNum){
        return firstNum*secondNum;

    }
    @GetMapping("/div/{first}/{second}")
    public double div(@PathVariable("first") double firstNum,
                      @PathVariable("second") double secondNum){
        return firstNum/secondNum;

    }
}