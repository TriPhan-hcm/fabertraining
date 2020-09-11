/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faber.flight.service;

import com.faber.flight.entity.Flight;
import com.faber.flight.respository.FlightRespository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author FB003
 */
@Service
public class FlightService implements FlightImpl{
    @Autowired
    private FlightRespository flightRepository;
    
    @Override
    public Iterable<Flight> findAll() {
        return flightRepository.findAll();
    }
    
   
    @Override
    public void save(Flight flight) {
          flightRepository.save(flight);
    }

    @Override
    public void delete(Long id) {
       flightRepository.deleteById(id);
    }

    @Override
    public Optional<Flight> findOne(Long id) {
        return flightRepository.findById(id);
    }
    
}
