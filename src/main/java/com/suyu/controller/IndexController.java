package com.suyu.controller;

import com.suyu.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class IndexController {
    @Autowired
    private User user;

    @RequestMapping(value = "/")
    public User index() {
        return user;
    }
}
