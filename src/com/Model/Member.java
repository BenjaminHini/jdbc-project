/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Model;
import com.Controller.DataAccessObject;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author vifag
 */

public class Member extends Customer{
    private double discount;
    
    public Member(String mail, String mdp, ArrayList<Ticket> tickets,double discount){
        super(mail,mdp, tickets);
        this.discount = discount;
    }
    

    
//Createur d'un nouveau membre.
    public Member(String mail, String mdp, int age){
        super(mail,mdp);
        if(age>=60)
            discount= 0.2;
        else if(age<=18)
            discount = 0.3;
        else
            discount = 0;
        //rajoute le membre a la base de donnée
        DataAccessObject dao = new DataAccessObject();
        String sqlData = ("INSERT INTO membre VALUES (\""+mail+"\",\""+mdp+"\","+discount+")");
        dao.executeUpdate(sqlData);
    }
    
//createur d'un membre provenant de la base de donnee
    public Member(String mail,String mdp, double discount){
        super(mail,mdp);
        
        if(discount < 0.4){
            int nbvu = 0;
            DataAccessObject dao = new DataAccessObject();
            String SQLStatement =("Select nombre from ticket where mailClient = \""+email+"\"");
            ResultSet result = dao.executeQuery(SQLStatement);
            try{    
                while(result.next())
                    nbvu += Integer.parseInt(result.getString(1));
            }
            catch(SQLException e ){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

            if(nbvu>15)
            {
                this.discount = 0.4;
                SQLStatement = ("UPDATE membre SET reduction = 0.4 WHERE mail = \""+email+"\"");
                dao.executeUpdate(SQLStatement);
            }
        }
        else
            this.discount = discount;
    }
    
    
    public double getDiscount(){
        return discount;
    }
    
    
    public ResultSet afficherHistorique(){
        String sqlStatement = ("SELECT nomFilm,dateVu,nombre,prix FROM ticket WHERE mailClient = \""+email+"\"");
        DataAccessObject dao = new DataAccessObject();
        return dao.executeQuery(sqlStatement);
    }
   
    
    @Override
    public void acheterTicket(Cinema cine, Movie movie,int nb){
    
        DataAccessObject dao = new DataAccessObject();
        for(int i=0; i<nb; ++i){
            tickets.add(new Ticket(ticketPrice(cine), this, movie.getSession().get(0)));
        }
        movie.addBuy(nb);
        String sqlData = ("INSERT INTO ticket VALUES (\""+movie.getName()+
                "\",\""+email+"\",\""+movie.getSession().get(0).getDateString()+
                "\","+ticketPrice(cine)*nb+","+nb+")");
        dao.executeUpdate(sqlData);
        Cinema.saveMovieUpdate(movie);
    }
    
    @Override
    public double isMember(){
        if(discount != 0)
            return discount;
        else
            return -1;
    }
    
    @Override
    public double ticketPrice(Cinema cine)
    {
        double prix=cine.getPrix();
        if(cine.getPromo()+discount <0.8)
            prix -= prix*(cine.getPromo()+discount);
        else
            prix -= prix*0.8;
        return prix;
     }
}