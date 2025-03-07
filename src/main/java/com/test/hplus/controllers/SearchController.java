/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.hplus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author kevinchen
 */
@Controller
public class SearchController {

    // @GetMapping("/search")
    // public String search() {
    //     System.out.println("In the search controller");
    //     return "search";
    // }
    @GetMapping("/search")
    public ModelAndView search() {
        System.out.println("In the search controller");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("search");
        return modelAndView;
    }

}
