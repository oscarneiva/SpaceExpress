/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
/**
 *
 * @author oscar neiva
 */
public class Manager {
    // Fields
    private int id;
    private String name;
    private float weight;
    private Order item;
    
    // Constructor
    public Manager(){
        item = new Order(id, name, weight);
    }
    
    // Access Modifiers
    
    
    // Other Methods
    
    // Create data
    
    // Read data
    
    
    // Update data
    public String updateName(String n){
        return item.getName();
    }
    
    // Delete data
    public void deleteItem(){
        if (id == item.getId()){
            //delete object
        }
    }
}
