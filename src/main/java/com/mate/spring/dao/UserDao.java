package com.mate.spring.dao;

import com.mate.spring.model.User;

public interface UserDao {

    User getByUsername(String username);

}
