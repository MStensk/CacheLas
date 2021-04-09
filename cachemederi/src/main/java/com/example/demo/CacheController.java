package com.example.demo;

import org.springframework.boot.autoconfigure.jms.JmsProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class CacheController{


    cache newCache = new cache();
    @GetMapping("/get-user-data")
    @ResponseBody
    public String getRandomCities(@RequestParam String id) throws InterruptedException{
        user newUser = new user(id);


        return "Found user with id: " + newUser.getId()+", value is: "+ newUser.getDataSlow();
    }
}
