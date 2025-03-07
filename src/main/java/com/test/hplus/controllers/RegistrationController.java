/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.hplus.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.hplus.beans.User;
import com.test.hplus.repository.UserRepository;

/**
 *
 * @author kevinchen
 */
@Controller
public class RegistrationController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/registeruser")
    public String registerUser(@ModelAttribute("newuser") User user, Model model) {
        System.out.println("In the register user controller");
        userRepository.save(user);
        model.addAttribute("dataSaved", "User registered successfully");

        return "login";
    }

}
