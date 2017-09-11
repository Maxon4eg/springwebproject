package com.mate.spring.service;

import com.mate.spring.dao.UserDao;
import com.mate.spring.model.Category;
import com.mate.spring.model.Product;
import com.mate.spring.model.Role;
import com.mate.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /*@PostConstruct
    public void init() {
        Role role = new Role();
        role.setId(1L);
        role.setRoleName("USER");
        Set<Role> roles = new HashSet<>();
        roles.add(role);

        User user = new User();
        user.setUsername("Vova123");
        user.setPassword("112233");
        user.setEmail("vova123@v.com");
        user.setRoles(roles);
        addUser(user);
    }
*/
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public User getUserByName(String name) {
        return userDao.getUserByName(name);
    }
}
