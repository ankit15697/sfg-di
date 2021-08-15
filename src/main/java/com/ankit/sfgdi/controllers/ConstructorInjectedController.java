package com.ankit.sfgdi.controllers;

import com.ankit.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    // making final is a good programming practice
    private final GreetingService greetingService;
//    No need to use Autowired for Constructor based dependency injected
    public ConstructorInjectedController(@Qualifier("greetingServiceSecondImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.greeting();
    }

}
