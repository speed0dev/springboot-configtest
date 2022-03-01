package com.example.demo.web.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    //
    @GetMapping("/sing-up")
    public String signUp(){

        return "";
    }

    @GetMapping("/events")
    public String events(){

        return "";
    }


}
