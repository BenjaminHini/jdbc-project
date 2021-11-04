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
import com.Controller.DataAccessObject;
import java.util.*;
import java.io.*;

public class Cinema {
   private ArrayList<Movie> films;
   private double promo;
   private static double prix = 9;
   
   //constructeur de base
    public Cinema(ArrayList<Movie> films){
        this.films = films;
        promo = 0;
    }
    
    //constructeur a partir du fichier currentmovie.txt
    public Cinema(){
        films = new ArrayList<Movie>();
        String nom, genre, image, date;
        int duree, views;
        try{
            File f = new File("currentmovie.txt");
            Scanner inf = new Scanner(f);
            promo = Double.parseDouble(inf.nextLine());
            for(int i = 0; i<3; ++i){
                nom = inf.nextLine();
                genre = inf.nextLine();
                image = inf.nextLine();
                date = inf.nextLine();
                duree = Integer.parseInt(inf.nextLine());
                views = Integer.parseInt(inf.nextLine());
                films.add(new Movie(nom,genre,date,duree,views,image));
            }
            inf.close();
        }
        catch(IOException e){System.out.println(e.getMessage());}
    }
    
    public double getPrix(){
        return prix;
    }
    
    public ArrayList<Movie> getFilms(){
        return films;
    }
    
    public int getNbFilms(){
    return films.size();
}
    public double getPromo(){
        return promo;
    }
    
    public void setPromo(double a){
        promo = a;
    }
    //sauvegarde les films passant actuellement dans currentmovie.txt
    public boolean saveCurrentMovie(){
        try{
            File f = new File("currentmovie.txt");
            PrintWriter ouf = new PrintWriter(f);
            ouf.println(promo);
            for(Movie movie : films){
                ouf.println(movie.getName());
                ouf.println(movie.getGenre());
                ouf.println(movie.getImageAddr());
                ouf.println(movie.getReleaseDate());
                ouf.println(movie.getRunningTime());
                ouf.println(movie.getNbBuy());
            }
            ouf.close();
            return true;
        }
        catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public static void saveMovieUpdate(Movie movie){
        DataAccessObject dao = new DataAccessObject();
        String sqlData = ("UPDATE films SET nbViewers = "+movie.getNbBuy()+" WHERE name = \""+movie.getName()+"\"");
        dao.executeUpdate(sqlData);
    }
}