/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author oscar neiva
 */
public class UserManager {
    private User usr;
    
    public UserManager(){
    }
    
    public void createUser(String n, String e, String psw) throws IOException
    {
        usr = new User(n, e, psw);
        String fileContent = usr.getName() + "," + usr.getEmail() + "," + usr.getPassword();
        FileWriter fileWriter = new FileWriter("C:/Users/oscar neiva/Documents/SpaceExpress/data/test.csv", true);
        fileWriter.write(fileContent);
        fileWriter.write(System.lineSeparator());
        fileWriter.close();
        
        // Operation log
        System.out.println( "User with email: " + usr.getEmail() + 
                            "; and password: "  + usr.getPassword() + 
                            " created.");
    }
}
