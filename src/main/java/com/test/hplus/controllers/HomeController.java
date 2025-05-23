/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.hplus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author kevinchen
 */
@Controller
public class HomeController {

    @GetMapping("/home")
    public String goHome() {
        System.out.println("in home page");
        return "index";
    }

    @GetMapping("/goToSearch")
    public String goToSearch() {
        System.out.println("in search page");
        return "search";
    }

    @GetMapping("/goToLogin")
    public String goToLogin() {
        System.out.println("in login page");
        return "login";
    }

    @GetMapping("/goToRegistration")
    public String goToRegistration() {
        System.out.println("in registration page");
        return "register";
    }
}
