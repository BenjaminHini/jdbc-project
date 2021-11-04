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

public class Session {
    private GregorianCalendar date;
    private static int nbPlace = 10;
    
    public Session(GregorianCalendar date){
        this.date = date;
    }
    
    public Session(int heure, int min){
        Calendar cal = Calendar.getInstance();
        date = new GregorianCalendar(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DATE), heure, min, 0);
    }
    
    public int getnbPlace(){
        return nbPlace;
    }
    
    public int getMonth(){
        return date.get(Calendar.MONTH);  
    }
    
    public String getDateString(){
        return (date.get(Calendar.YEAR)+"-"+(date.get(Calendar.MONTH)+1)+"-"+date.get(Calendar.DATE));
    }
    
    public Date getFullDate(){
        return date.getTime();
    }
    public GregorianCalendar getDate(){
        return date;
    }
    
    public void removePlace(int a){
        nbPlace -= a;
    }
}