/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.hplus.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.hplus.beans.Product;
import com.test.hplus.repository.ProductRepository;

/**
 *
 * @author kevinchen
 */
@RestController
public class ProductsRestController {

    @Autowired
    private ProductRepository productRepository;

    // @GetMapping("/hplus/rest/products")
    // @ResponseBody
    // public List<Product> getProducts() {
    //     List<Product> products = new ArrayList<>();
    //     productRepository.findAll().forEach(products::add);
    //     return products;
    // }

    @GetMapping("/hplus/rest/products")
    public ResponseEntity<List<Product>> getProductsByRequestParam(@RequestParam("name") String name) {
        List<Product> products = productRepository.searchByName(name);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/hplus/rest/products/{name}")
    public ResponseEntity<List<Product>> getProductsByPathVariable(@PathVariable("name") String name) {
        List<Product> products = productRepository.searchByName(name);
        return ResponseEntity.ok(products);
    }
}
