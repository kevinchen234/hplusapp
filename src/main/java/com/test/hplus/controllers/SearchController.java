/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.hplus.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.hplus.beans.Product;
import com.test.hplus.repository.ProductRepository;

/**
 *
 * @author kevinchen
 */
@Controller
public class SearchController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/search")
    public String search(@RequestParam("search") String search, Model model) {
        System.out.println("In the search controller");
        System.out.println("Search criteria: " + search);

        List<Product> products = productRepository.searchByName(search);
        model.addAttribute("products", products);
        return "search";
    }

    // @GetMapping("/search")
    // public ModelAndView search(@RequestParam("search") String search, Model model) {
    //     System.out.println("In the search controller");
    //     System.out.println("Search criteria: " + search);
    //     ModelAndView modelAndView = new ModelAndView();
    //     modelAndView.setViewName("search");
    //     List<Product> products = new ArrayList<>();
    //     products = productRepository.searchByName(search);
    //     model.addAttribute("products", products);
    //     return modelAndView;
    // }
}
