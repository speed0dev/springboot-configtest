package com.example.demo.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Slf4j
@Controller
public class BaseController implements ErrorController {

//    @GetMapping("/")
//    public String root(){
//
//        log.debug("index <========");
//        log.debug("index <========");
//        log.debug("index <========");
//
//
//        //
//        return "index";
//    }

//    @RequestMapping("/error")
//    public String error(){
//        log.debug("error <========");
//
//        return "error";
//    }

}
