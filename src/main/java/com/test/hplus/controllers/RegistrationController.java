/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.hplus.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.hplus.beans.User;
import com.test.hplus.repository.UserRepository;

import jakarta.validation.Valid;

/**
 *
 * @author kevinchen
 */
@Controller
public class RegistrationController {

    @Autowired
    private UserRepository userRepository;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        System.out.println("In the init binder method");
        binder.registerCustomEditor(Date.class, "dateOfBirth", new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
    }

    @PostMapping("/registeruser")
    public String registerUser(@Valid @ModelAttribute("newuser") User user, BindingResult result, Model model) {
        System.out.println("In the register user controller");
        System.out.println(user.getDateOfBirth());
        if (result.hasErrors()) {
            return "register";
        }
        userRepository.save(user);
        model.addAttribute("dataSaved", "User registered successfully");

        return "login";
    }

}
