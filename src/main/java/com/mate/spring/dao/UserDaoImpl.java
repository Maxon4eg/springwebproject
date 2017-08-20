package com.mate.spring.dao;

import com.mate.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
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
    }
}
