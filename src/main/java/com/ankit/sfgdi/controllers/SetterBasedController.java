package com.ankit.sfgdi.controllers;

import com.ankit.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterBasedController {
    private GreetingService greetingService;

    public String getGreeting() {
        return greetingService.greeting();
    }
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

}
