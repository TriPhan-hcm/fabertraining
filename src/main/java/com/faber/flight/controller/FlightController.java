/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faber.flight.controller;

import com.faber.flight.entity.Flight;
import com.faber.flight.service.FlightService;
import com.faber.flight.service.LocationService;
import com.faber.flight.service.OrderService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author FB003
 */
@Controller
public class FlightController {
    @Autowired
    private FlightService flightService;
    
    @Autowired
    private OrderService orderService;
    
    @Autowired
    private LocationService locationService;
    
    @GetMapping("/")
    public String searchFilght(){
        
        return "search";
    }
    
    @GetMapping("/flight")
    public String listFlight(Model model){
        model.addAttribute("flights", flightService.findAll());
        model.addAttribute("locations", locationService.findAll());
        return "list_1";
    }
    @GetMapping("/flight/add")
    public String add(Model model){
        model.addAttribute("flight",new Flight());
        return "add";
    }
    @PostMapping("/flight/save")
    public String save(@Valid Flight flight, BindingResult result, RedirectAttributes redirect) {
    flightService.save(flight);
    return "redirect:/flight";
    }
    
    @GetMapping("/flight/{id}/edit")
    public String edit(@PathVariable("id")Long id, Model model){
        model.addAttribute("", id);
        return "add";
    }
    @GetMapping("/order")
    public String listOrder(Model model){
        model.addAttribute("orders", orderService.findAll());
        return "list";
    }
}
