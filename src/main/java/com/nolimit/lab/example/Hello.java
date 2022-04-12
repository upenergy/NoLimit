package com.nolimit.lab.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@SpringBootApplication
@RequestMapping("/hello")
public class Hello{

    @RequestMapping(value = "/visit", method = RequestMethod.POST)
    public String visit(){

        return "";
    }

}