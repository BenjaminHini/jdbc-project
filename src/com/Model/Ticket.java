/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Model;

/**
 *
 * @author vifag
 */
public class Ticket {
    private double price;
    private Customer customer;
    private Session sessions;
    
    public Ticket(double price, Customer customer, Session sessions){
        this.price = price;
        this.customer = customer;
        this.sessions = sessions;
    }
    
    public double getPrice(){
        return price;
    }
    
    public Customer getCustomer(){
        return customer;
    }
    
    public Session getSession(){
        return sessions;
    }
    
}
