/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Model;
import com.Controller.DataAccessObject;
import java.util.*;
import javax.swing.ImageIcon;

/**
 *
 * @author vifag
 */

public class Movie {
    private String name, genre, releaseDate,addrImage;
    private int runningTime, nbBuy;
    private ImageIcon image;
    private ArrayList<Session> sessions;
    //createur general
    public Movie(String name, String genre, String releaseDate, int runningTime, int nbBuy, ImageIcon image, ArrayList<Session> session){
        this.name = name;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.runningTime = runningTime;
        this.nbBuy = nbBuy;
        this.image = image;
        this.sessions = session;
        addrImage = null;//pas besoin de l'addresse car on importe directement l'image
    }
    //createur equivalent a celui de la base de donnee
    public Movie(String name, String genre, String releaseDate, int runningTime, int nbBuy, String addrImage){
        this.name = name;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.runningTime = runningTime;
        this.nbBuy = nbBuy;
        this.addrImage = addrImage;
        image = new ImageIcon(addrImage);//cree l'image a partir de son addresse
        this.createSessions();
    }
    public String getName(){
        return name;
    }
    public String getGenre(){
        return genre;
    }
    public String getReleaseDate(){
        return releaseDate;
    }
    public int getNbBuy(){
        return nbBuy;
    }
    public int getRunningTime(){
        return runningTime;
    }
    public ImageIcon getImage(){
        return image;
    }
    public ArrayList<Session> getSession(){
        return sessions;
    }
    public int getNbSessison(){
        return sessions.size();
    }
    
    public String getImageAddr(){
        return addrImage;
    }
    
    public void addBuy(int a){
        nbBuy+=a;
    }
    
    public void createSessions(){
        sessions = new ArrayList<>();
        sessions.add(new Session(13,0));
        sessions.add(new Session(15,15));
        sessions.add(new Session(18,0));
    }
    
    public void addToDataBase(){
        
        DataAccessObject dao = new DataAccessObject();
        String sqlData = ("INSERT INTO films VALUES (\""+ name +
                        "\",\""+ genre +"\",\""+ image + 
                        "\",\"" + releaseDate + "\","+ runningTime + " , " +nbBuy+ ")");
        String sqlData2 = ("SELECT nbViewers FROM films WHERE name = \"" + name + "\"");
        
        nbBuy = dao.AddMovieToDatabase(sqlData, sqlData2, nbBuy);
    }
}
