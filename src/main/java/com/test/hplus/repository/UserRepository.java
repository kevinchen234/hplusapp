/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.test.hplus.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.hplus.beans.User;

/**
 *
 * @author kevinchen
 */
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    @Query("select u from User u where u.username = :name")
    public User searchByName(@Param("name") String username);
}
