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
        System.out.println("in home controller");
        return "index";
    }

    @GetMapping("/goToSearch")
    public String goToSearch() {
        System.out.println("in search controller");
        return "search";
    }

}
