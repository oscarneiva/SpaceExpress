/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules;

/**
 *
 * @author oscar neiva
 */
public class User {
    
    // Fields
    private String name;
    private String email;
    private String password;
    
    // Constructor
    public User(String n, String e, String psw){
        this.name = n;
        this.email = e;
        this.password = psw;
    }
    
    // Constructor
    public User(){
    }
    
    // Accessors and Mutators 
    public String getName(){
        return name;
    }
    
    public void setName(String n){
        this.name = n;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String e){
        this.email = e;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String psw){
        this.password = psw;
    }
}
