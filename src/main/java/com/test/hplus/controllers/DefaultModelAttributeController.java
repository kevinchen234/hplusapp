/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.hplus.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.test.hplus.beans.Login;
import com.test.hplus.beans.User;

/**
 *
 * @author kevinchen
 */
@ControllerAdvice
public class DefaultModelAttributeController {

    @ModelAttribute("newuser")
    public User getDefaultUser() {
        return new User();
    }

    @ModelAttribute("genderItems")
    public List<String> getGenderItems() {
        return Arrays.asList("Male", "Female", "Other");
    }

    @ModelAttribute("login")
    public Login getDefaultLogin() {
        return new Login();
    }
}
