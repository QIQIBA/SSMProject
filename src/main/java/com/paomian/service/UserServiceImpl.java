package com.paomian.service;

import com.paomian.dao.UserDao;
import com.paomian.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by luokun on 2016/12/18.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    public User selectUserById(Integer userId) {
        return userDao.selectUserById(userId);
    }
}
