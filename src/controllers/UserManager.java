/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author oscar neiva
 */
public class UserManager {
    private User user;
    
    public UserManager(){
        // Load all the users in the RAM memory
    }
    
    // CRUD - Create a user on the signup screen.
    public void createUser(String name, String email, String password) throws IOException{
        user = new User(name, email, password);
        String fileContent = user.getName() + "," + user.getEmail() + "," + user.getPassword();
        FileWriter fileWriter = new FileWriter("./data/users.csv", true);
        fileWriter.write(fileContent);
        fileWriter.write(System.lineSeparator());
        fileWriter.close();
        
        // Operation log.
        System.out.println( "User with email: " + user.getEmail() + 
                            "; and password: "  + user.getPassword() + 
                            " created.");
    }
    
    // CRUD - Read all the users to initialize program.
    public void readUser() throws IOException{
        FileReader fileReader = new FileReader("./data/users.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        
        String fileContent; 
        while((fileContent = bufferedReader.readLine()) != null) { 
            String[] fileData = fileContent.split(","); 
            user = new User(fileData[0], fileData[1], fileData[2]);
        }
            
        fileReader.close();
    }
    
    // CRUD - Read email and password for login
    public boolean readUser(String email, String password){
        while(user != null) { 
            System.out.println(user.getEmail());
            if(email == user.getEmail() && password == user.getPassword()){
                return true;
            }
        }
        return false;
    }
}
