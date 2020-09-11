/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faber.flight.controller;

import com.faber.flight.entity.Flight;
import com.faber.flight.entity.Location;
import com.faber.flight.entity.Order;
import com.faber.flight.entity.TypeFlight;
import com.faber.flight.service.FlightService;
import com.faber.flight.service.LocationService;
import com.faber.flight.service.OrderService;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
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
    
    @GetMapping("/search")
    public String listData(Model model){
        model.addAttribute("orders", orderService.findOne(Long.MIN_VALUE));
        model.addAttribute("flights", flightService.findOne(Long.MIN_VALUE));
        return "search";
    }
    
    @GetMapping("/flight")
    public String listFlight(Model model){
        model.addAttribute("flights", flightService.findAll());
        model.addAttribute("locations", locationService.findAll());
        return "listFlight";
    }
    @GetMapping("/flight/add")
    public String add(Model model){
        model.addAttribute("flight",new Flight());
        model.addAttribute("location", new Location());
        return "form";
    }
    @PostMapping("/flight/save")
    public String save(Flight flight, BindingResult result, RedirectAttributes redirect) {
        if(result.hasErrors()){
            return "form";
        } 
        flightService.save(flight);
        redirect.addFlashAttribute("successMessage","Saved Successfully");
        return "redirect:/flight";
    }
    
    @GetMapping("/flight/{id}/edit")
    public String edit(@PathVariable("id")Long id
            
            , Model model){
        
        model.addAttribute("flight", flightService.findOne(id));
        return "form";
    }
    @GetMapping("/flight/{id}/delete")
    public String delete(@PathVariable Long id, RedirectAttributes redirect){
        flightService.delete(id);
        redirect.addFlashAttribute("successMessage","Deleted Successfully");
        return "redirect:/flight";
    }
    
    @GetMapping("/orderList")
    public String listOrder(Model model){
        model.addAttribute("orders", orderService.findAll());
        return "listOrder";
    }
    public Set<TypeFlight> initType(){
        Set<TypeFlight> set = new HashSet<TypeFlight>();
        return set;
    }
}
