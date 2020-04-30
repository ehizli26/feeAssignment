package com.feeassignment.demo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.feeassignment.demo.Entitiy.User;
import com.feeassignment.demo.services.Login_Service;



@RestController
public class LoginController {
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private Login_Service login_Service;

    @PostMapping("/login")
    public User authenticate(@Validated @RequestBody User user) {

        return login_Service.authenticateUser(user);
    }

}
