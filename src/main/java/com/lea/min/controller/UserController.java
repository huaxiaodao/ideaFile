package com.lea.min.controller;

import com.lea.min.entity.User;
import com.lea.min.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public User getUser(int id) {
        //System.out.println("test :id: "+id);
        User user = userService.selectUser(id);
        logger.info("user_id:[{}]",user.getUser_id());
        logger.info("user_name:[{}]",user.getUser_name());
        return user;
    }
}
