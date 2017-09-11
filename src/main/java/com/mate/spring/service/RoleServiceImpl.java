package com.mate.spring.service;

import com.mate.spring.dao.RoleDao;
import com.mate.spring.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public Role getRoleByRoleName(String roleName) {
        return roleDao.getRole(roleName);
    }
}
