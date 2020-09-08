/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faber.flight.service;

import com.faber.flight.entity.Location;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author FB003
 */
public interface LocationImpl {
    Iterable<Location> findAll();
//    @Query("SELECT p FROM Product p WHERE CONCAT(p.name, p.brand, p.madein, p.price) LIKE %?1%")
//    List<Location> search(String name);
    Optional<Location> fineOne(Long id);
    void save(Location location);
    void delete(Long id);
}
