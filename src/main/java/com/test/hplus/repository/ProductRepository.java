/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.test.hplus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.test.hplus.beans.Product;

/**
 *
 * @author kevinchen
 */
public interface ProductRepository extends CrudRepository<Product, Integer> {

    @Query("select p from Product p where p.name like %:name%")
    public List<Product> searchByName(@Param("name") String name);
}
