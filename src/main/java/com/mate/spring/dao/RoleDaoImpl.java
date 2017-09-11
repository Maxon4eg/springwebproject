package com.mate.spring.dao;

import com.mate.spring.model.Role;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public class RoleDaoImpl extends AbstractDao implements RoleDao {

    @Override
    public Role getRole(String roleName) {
        String query = "from Role where roleName =:roleName";
        return (Role) sessionFactory.getCurrentSession().createQuery(query).setParameter("roleName", roleName).uniqueResult();
    }
}