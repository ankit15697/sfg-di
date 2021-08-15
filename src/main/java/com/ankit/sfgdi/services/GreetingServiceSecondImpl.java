package com.ankit.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceSecondImpl implements GreetingService {
    @Override
    public String greeting() {
        return "Second Greeting service implementation";
    }
}
