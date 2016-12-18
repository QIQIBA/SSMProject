package com.paomian.service;

import com.paomian.baseTest.SpringTestCase;
import com.paomian.domain.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by luokun on 2016/12/18.
 */
public class UserServiceTest extends SpringTestCase {

    @Autowired
    private UserService userService;

    @Test
    public void selectUserByIdTest(){
        User user = userService.selectUserById(1);
        System.out.println(user.getUserName() + ":" + user.getUserPassword());
    }
}
