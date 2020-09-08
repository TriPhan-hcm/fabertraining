/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.faber.flight.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Admin
 */
@Entity
@Table(name="tbl_flight")
public class Flight {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @OneToOne
    @JoinColumn(name ="id_departure", nullable = false)
    private Location id_departure;
    
    @OneToOne
    @JoinColumn(name ="id_arrival", nullable = false)
    private Location id_arrival;
    
    @Column(name = "datetime_departure")
    private Date datetime_departure;
    
    @Column(name = "datetime_arrival")
    private Date datetime_arrival;
    
    @Column(name="price")
    private double price;
    //one
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "flight")
    private List<Order> listOrder = new ArrayList<>();

    public Flight() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Location getId_departure() {
        return id_departure;
    }

    public void setId_departure(Location id_departure) {
        this.id_departure = id_departure;
    }

    public Location getId_arrival() {
        return id_arrival;
    }

    public void setId_arrival(Location id_arrival) {
        this.id_arrival = id_arrival;
    }

    public Date getDatetime_departure() {
        return datetime_departure;
    }

    public void setDatetime_departure(Date datetime_departure) {
        this.datetime_departure = datetime_departure;
    }

    public Date getDatetime_arrival() {
        return datetime_arrival;
    }

    public void setDatetime_arrival(Date datetime_arrival) {
        this.datetime_arrival = datetime_arrival;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Order> getListOrder() {
        return listOrder;
    }

    public void setListOrder(List<Order> listOrder) {
        this.listOrder = listOrder;
    }
    
    
    
}
