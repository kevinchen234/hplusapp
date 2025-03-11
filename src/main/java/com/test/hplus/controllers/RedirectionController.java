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
public class RedirectionController {
  @GetMapping("/redirectToLinkedIn")
  public String redirectOut() {
    return "redirect:https://www.linkedin.com";
  }
}
