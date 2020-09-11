/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faber.flight.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "tbl_order")
public class Order {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="datetime")
    private LocalDateTime datetime;
    
    @Column(name = "type_flight")
    @Enumerated(EnumType.STRING)
    private TypeFlight type_flight;
    //many
    @ManyToOne
    @JoinColumn(name="id_flight", nullable = false)
    private Flight flight;
    
    @Column(name="total_person", nullable = false)
    private Integer total_person;
    
    @Column(name="price_person", nullable = false)
    private double price_person;
    
    @Column(name = "total_price")
    private Double total_price;

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }

    public TypeFlight getType_flight() {
        return type_flight;
    }

    public void setType_flight(TypeFlight type_flight) {
        this.type_flight = type_flight;
    }

    public Integer getTotal_person() {
        return total_person;
    }

    public void setTotal_person(Integer total_person) {
        this.total_person = total_person;
    }

    public double getPrice_person() {
        return price_person;
    }

    public void setPrice_person(double price_person) {
        this.price_person = price_person;
    }

    public Double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(Double total_price) {
        this.total_price = total_price;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
    
}
