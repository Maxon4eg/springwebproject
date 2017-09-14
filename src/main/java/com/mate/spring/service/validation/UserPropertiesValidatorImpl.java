package com.mate.spring.service.validation;

import com.mate.spring.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserPropertiesValidatorImpl implements UserValidator {

    @Override
    public boolean validate(User user) {
        return false;
    }
}
