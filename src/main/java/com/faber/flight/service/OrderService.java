/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faber.flight.service;

import com.faber.flight.entity.Order;
import com.faber.flight.respository.FlightRespository;
import com.faber.flight.respository.OrderRespository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author FB003
 */
@Service
public class OrderService implements OrderImpl{
    @Autowired
    private OrderRespository orderRepository;
    
    @Autowired
    private FlightRespository flightRepository;

    @Override
    public Iterable<Order> findAll() {
        return orderRepository.findAll();
    }

    
    @Override
    public void save(Order order) {
        orderRepository.save(order);
    }

    @Override
    public void delete(Long id) {
        orderRepository.deleteById(id);
    }

    @Override
    public Optional<Order> findOne(Long id) {
        return orderRepository.findById(id);
    }
    
    
}
