package com.ankit.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String greeting() {
        return "Hello World Greeting !!! ";
    }
}
