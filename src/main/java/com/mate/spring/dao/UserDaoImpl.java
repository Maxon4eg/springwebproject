package com.mate.spring.dao;

import com.mate.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;

@Deprecated
@Repository
@Transactional
public class UserDaoImpl extends AbstractDao implements UserDao {


    @Override
    public void addUser(User user) {
        //this.sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public User getUserByName(String name) {
        String query = "from User where username =:name";
        return null; //return (User) this.sessionFactory.getCurrentSession()
        //                   .createQuery(query)
        //                   .setParameter("name", name)
        //                   .uniqueResult();
    }

    @Override
    public User getUserByEmail(String email) {
        String query = "from User where username =:email";
        return null;//return (User) this.sessionFactory.getCurrentSession()
        //        .createQuery(query)
        //        .setParameter("email", email)
        //        .uniqueResult();
    }

    /*@Autowired
    private JdbcTemplate jdbcTemplate;

    public User getByUsername(String username) {
        String sql = "select id, username, password, token, email from users where username = ?";
        User user = this.jdbcTemplate.queryForObject(sql, new Object[] {username}, (rs, rm) -> {
            User result = new User();
            result.setId(rs.getInt("ID"));
            result.setUsername(rs.getString("USERNAME"));
            result.setToken(rs.getString("TOKEN"));
            result.setPassword(rs.getString("PASSWORD"));
            result.setEmail(rs.getString("EMAIL"));
            return result;
        });
        return user;
    }*/



}
