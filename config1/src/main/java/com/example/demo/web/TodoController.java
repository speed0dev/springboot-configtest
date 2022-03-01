package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {

    @GetMapping("/do")
    @ResponseBody
    public String getDo(){
        //

        String r = "checkName444444";
        return r + "{0}ㅇㄴㄹㄴㅇ그렇구나..ㅋㅋㅋㅇㅇㅇㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ AAAAAAAAAA- BBBB - SSS AAAAAAAAAAA";

    }

    @GetMapping("/check")
    public String check(){

        return "";
    }

}
