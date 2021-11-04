/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Model;
import java.util.*;
/**
 *
 * @author vifag
 */

public abstract class Customer extends Users{
    
    protected ArrayList<Ticket> tickets;
    
    public Customer(String mail, String mdp, ArrayList<Ticket> tickets){
        super(mail, mdp);
        this.tickets = tickets;
    }
    
    public Customer(String mail, String mdp ){
        super(mail,mdp);
        tickets = new ArrayList<>(); 
    }
        
    public abstract void acheterTicket(Cinema cine,Movie movie,int nb);
    public abstract double isMember(); 
    public abstract double ticketPrice(Cinema cine);
}
