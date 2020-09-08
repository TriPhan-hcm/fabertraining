/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faber.flight.service;

import com.faber.flight.entity.Location;
import com.faber.flight.respository.LocationResponsitory;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author FB003
 */
@Service
public class LocationService implements LocationImpl{
    @Autowired
    private LocationResponsitory locationRepository;

    @Override
    public Iterable<Location> findAll() {
        return locationRepository.findAll();
    }

    @Override
    public void save(Location location) {
        locationRepository.save(location);
    }

    @Override
    public void delete(Long id) {
        locationRepository.deleteById(id);
    }

    @Override
    public Optional<Location> fineOne(Long id) {
        return locationRepository.findById(id);
    }

   
    
}
