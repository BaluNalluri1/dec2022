package com.example.dec2022.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hellocontroller {
    @GetMapping("/msgGreet")
    public String Hello()
    {
        return "welcome to springboot";
    }
    @GetMapping("/msgGreet/{name}")
    public String sayHello(@PathVariable("name")String inputName)
    {return "Heloo" +inputName+",Welcome to java framework";}

}
