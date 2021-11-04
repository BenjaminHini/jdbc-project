/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Model;
import com.Controller.DataAccessObject;
import java.sql.*;
/**
 *
 * @author vifag
 */


public class Employee extends Users {
    private Cinema cine;
    
    public Employee(String mail, String mdp, Cinema cine){
        super(mail, mdp);
        this.cine = cine;
    }
    
    public void setPromo(double promo){
        cine.setPromo(promo);
        cine.saveCurrentMovie();
    }
    
    public ResultSet getFilmByPopularity(){
        DataAccessObject dao = new DataAccessObject();
        String sqlStatement =("SELECT name,nbViewers FROM films ORDER BY nbViewers DESC");
        return dao.executeQuery(sqlStatement);
    }
    
    public ResultSet afficherClient(){
        
        DataAccessObject dao = new DataAccessObject();
        String sqlStatement =("SELECT * FROM membre");
        return dao.executeQuery(sqlStatement);
    }
}