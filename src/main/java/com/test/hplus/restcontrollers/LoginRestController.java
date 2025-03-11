/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.test.hplus.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.hplus.beans.Login;
import com.test.hplus.beans.User;
import com.test.hplus.exceptions.LoginFailureException;
import com.test.hplus.repository.UserRepository;


/**
 *
 * @author kevinchen
 */
@RestController
public class LoginRestController {

  @Autowired
  private UserRepository userRepository;

  @PostMapping("/hplus/rest/loginuser")
  public ResponseEntity<String> loginUser(@RequestBody Login login) throws LoginFailureException {
      System.out.println("In login rest controller");
      System.out.println("User logged in is: " + login.getUsername() + " " + login.getPassword());
      User user = userRepository.searchByName(login.getUsername());
      if (user == null) {
          return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
      }
      if (user.getUsername().equals(login.getUsername()) && user.getPassword().equals(login.getPassword())) {
          return ResponseEntity.ok().body("Welcome, " + user.getUsername());
      } else {
          throw new LoginFailureException("Invalid username or password");
      }
  }

}
