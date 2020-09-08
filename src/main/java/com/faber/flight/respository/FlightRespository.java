/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faber.flight.respository;

import com.faber.flight.entity.Flight;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Admin
 */
@Repository
public interface FlightRespository extends JpaRepository<Flight, Long>{
    @Query("SELECT p FROM Flight p WHERE CONCAT(p.id_departure, p.id_arrival, p.datetime_departure,p.datetime_arrival, p.price) LIKE %?1%")
    public List<Flight> search(String keyword);
}
