/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.hplus.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.async.DeferredResult;

import com.test.hplus.beans.Product;
import com.test.hplus.repository.ProductRepository;

import jakarta.servlet.http.HttpServletRequest;

/**
 *
 * @author kevinchen
 */
@Controller
public class SearchController {

    @Autowired
    private ProductRepository productRepository;

    // @GetMapping("/search")
    // public Callable<String> search(@RequestParam("search") String search, Model model, HttpServletRequest request) {
    //     System.out.println("In the search controller");
    //     System.out.println("Search criteria: " + search);
    //     System.out.println("Async supported in application: " + request.isAsyncSupported());
    //     System.out.println("Thread from the servlet container: " + Thread.currentThread().getName());
    //     return () -> {
    //         Thread.sleep(3000);
    //         System.out.println("Thread from the spring mvc task executor: " + Thread.currentThread().getName());
    //         List<Product> products = productRepository.searchByName(search);
    //         model.addAttribute("products", products);
    //         return "search";
    //     };
    // }
    @Autowired
    private AsyncTaskExecutor taskExecutor;

    @GetMapping("/search")
    public DeferredResult<String> search(@RequestParam("search") String search, Model model, HttpServletRequest request) {
        DeferredResult<String> deferredResult = new DeferredResult<>();
        System.out.println("In the search controller");
        System.out.println("Search criteria: " + search);
        System.out.println("Async supported in application: " + request.isAsyncSupported());
        System.out.println("Thread from the servlet container: " + Thread.currentThread().getName());

        taskExecutor.execute(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread from the spring mvc task executor: " + Thread.currentThread().getName());
            List<Product> products = productRepository.searchByName(search);
            model.addAttribute("products", products);
            deferredResult.setResult("search");
        });
        return deferredResult;
    }
}
