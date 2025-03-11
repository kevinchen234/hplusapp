/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.hplus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

/**
 *
 * @author kevinchen
 */
@Controller
public class LogoutController {

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        System.out.println("Ending user session");
        session.invalidate();
        return "login";
    }

}
