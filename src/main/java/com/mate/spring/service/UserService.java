package com.mate.spring.service;

import com.mate.spring.model.User;

public interface UserService {

    User getByUsername(String username);

}
