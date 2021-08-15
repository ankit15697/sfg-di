package com.ankit.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nService")
@Profile("EN")
public class I18NEnglishGreetingService implements GreetingService {
    @Override
    public String greeting() {
        return "English Greeting";
    }
}
