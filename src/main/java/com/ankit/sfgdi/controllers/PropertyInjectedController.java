package com.ankit.sfgdi.controllers;

import com.ankit.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingService;
    public String getGreeting(){
        return greetingService.greeting();
    }

}
