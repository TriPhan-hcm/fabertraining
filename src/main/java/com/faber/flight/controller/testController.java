/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faber.flight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Admin
 */
@Controller
public class testController {
    
    @RequestMapping("/123")
    public String sayHello(){
        return "index";
    }
    @RequestMapping("/home")
    public String home(){
        return "search";
    }
}
