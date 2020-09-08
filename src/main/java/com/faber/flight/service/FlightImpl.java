/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faber.flight.service;

import com.faber.flight.entity.Flight;
import java.util.Optional;

/**
 *
 * @author FB003
 */

public interface FlightImpl {
    Iterable<Flight> findAll();
    Optional<Flight> findOne(Long id);
    void save(Flight flight);
    void delete(Long id);
}
