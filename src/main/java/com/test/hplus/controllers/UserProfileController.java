/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.test.hplus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.test.hplus.beans.Login;




/**
 *
 * @author kevinchen
 */
@Controller
public class UserProfileController {

  @PostMapping("/userprofile")
  public String getUserProfile(@SessionAttribute("login") Login login, Model model) {
      System.out.println("In get user profile method");
      System.out.println("User logged in is: " + login.getUsername());
      model.addAttribute("username", login.getUsername());
      return "profile";
  }


}
