package com.ankit.sfgdi.controllers;

import com.ankit.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterBasedControllerTest {
    private SetterBasedController setterBasedController;
    @BeforeEach
    void setUp() {
        setterBasedController = new SetterBasedController();
        setterBasedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(setterBasedController.getGreeting());
    }
}