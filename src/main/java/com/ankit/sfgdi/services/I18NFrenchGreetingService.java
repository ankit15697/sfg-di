package com.ankit.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nService")
@Profile("FN")
public class I18NFrenchGreetingService implements GreetingService {
    @Override
    public String greeting() {
        return "French Greeting";
    }
}
