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
public abstract class Users {
    protected String email;
    protected String password;
    
    public Users(String email, String password){
        this.email = email;
        this.password = password;
    }
    public String getMail(){
        return email;
    }
    
    public String getPassword(){
        return password;
    }
}
 