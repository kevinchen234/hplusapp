/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.hplus.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.hplus.beans.Login;
import com.test.hplus.beans.User;
import com.test.hplus.exceptions.ApplicationException;
import com.test.hplus.repository.UserRepository;

/**
 *
 * @author kevinchen
 */
@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public String login(@ModelAttribute("login") Login login) {
        User user = userRepository.searchByName(login.getUsername());
        if (user == null) {
            throw new ApplicationException("User does not exist");
        }
        return "search";
    }
}
