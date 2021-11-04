/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controller;
import java.sql.*;
import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author benja
 */

public class DataAccessObject {
    
    private static String[] data;
    private  Connection conn;// = DriverManager.getConnection(data[0],data[1],data[2]);
    private static Statement stmt;
    
    public DataAccessObject(){
        getMySQLData();
        try{
            conn = DriverManager.getConnection(data[0],data[1],data[2]);
            stmt = conn.createStatement();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public  void executeUpdate(String request){
        try{
            stmt.executeUpdate(request);
            conn.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }
    
    public  ResultSet executeQuery(String request){
        try{
            ResultSet result = stmt.executeQuery(request);
            return result;
        }catch(SQLException e ){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    }
    
    public static void getMySQLData(){
        data = new String [3];
        int i=0;
        try{
            File f = new File("data.txt");
            Scanner inf = new Scanner(f);
            while(inf.hasNext()){
                data[i]= inf.nextLine();
                ++i;
            }
            if(data[2] == null)
                data[2]="";
        }
        catch(FileNotFoundException e){System.out.println(e.getMessage());}
    }
    
    public int AddMovieToDatabase(String request1, String request2, int nb){
        try{
            stmt.executeUpdate(request1);
            conn.close();
            return nb;
        }
        catch(SQLException e){
            try{
                ResultSet result = stmt.executeQuery(request2);
                result.last();
                nb = Integer.parseInt(result.getString(1));
                conn.close();
                return nb;
            }
            catch(SQLException e2){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        return nb;
    }
    
    
}
