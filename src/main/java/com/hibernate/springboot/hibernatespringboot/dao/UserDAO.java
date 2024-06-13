package com.hibernate.springboot.hibernatespringboot.dao;

import com.hibernate.springboot.hibernatespringboot.entity.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();
    void saveUser(User user);
    User getUser(long id);
    void deleteUser(long id);
}
