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
import java.util.LinkedList;

/**
 *
 * @author oscar neiva
 */
public class UserManager {
    public static User activeUser;
    
    private LinkedList<User> users;
    private User user;
    
    
    public UserManager() throws IOException{
        users = new LinkedList<User>();
    }
    
    // Load all the users in RAM when initializing the program.
    public void loadAllUsers() throws IOException{
        FileReader fileReader = new FileReader("./data/users.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        
        String fileContent; 
        while((fileContent = bufferedReader.readLine()) != null) { 
            String[] fileData = fileContent.split(","); 
            user = new User(fileData[0], fileData[1], fileData[2]);
            users.add(user);
        }
            
        fileReader.close();
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
    
    // CRUD - Read email and password for login
    public boolean readUser(String email, String password) throws IOException{
        loadAllUsers();
        for(int i = 0; i < users.size(); i++) {
            // Always use equals() when comparing strings and objects in JAVA!
            if( users.get(i).getEmail().equals(email) && users.get(i).getPassword().equals(password) ){
                activeUser = new User();
                activeUser = users.get(i);
                return true;
            }
        }
        return false;
    }
}
