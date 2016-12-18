package com.paomian.dao;

import com.paomian.domain.User;

/**
 * Created by luokun on 2016/12/18.
 */
public interface UserDao {

    public User selectUserById(Integer userId);

}
