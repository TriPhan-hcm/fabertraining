/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faber.flight.service;

import com.faber.flight.entity.Order;
import java.util.Optional;

/**
 *
 * @author FB003
 */
public interface OrderImpl {
    Iterable<Order> findAll();
    Optional<Order> findOne(Long id);
    void save(Order order);
    void delete(Long id);
}
