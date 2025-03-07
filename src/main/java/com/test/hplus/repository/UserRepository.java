/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.test.hplus.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.hplus.beans.User;

/**
 *
 * @author kevinchen
 */
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
