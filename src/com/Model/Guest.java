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

public class Guest extends Customer{
        
    public Guest(String mail, String mdp, ArrayList<Ticket> tickets){
        super(mail,mdp, tickets);
    }
 
    public Guest(){
        super(null,null,null);
        tickets = new ArrayList<>();
    }
    
    
    @Override
    public void acheterTicket(Cinema cine,Movie movie,int nb){
        movie.addBuy(nb);
        Cinema.saveMovieUpdate(movie);
    }  
    
    @Override
    public double isMember(){
        return 0;
    }
    
    @Override
    public double ticketPrice(Cinema cine){
         return (1-cine.getPromo())*cine.getPrix();
     }

}