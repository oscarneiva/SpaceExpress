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
public class Order {
    // Fields
    private String customer;
    private Item[] items;
    
    // Constructor
    public Order(String c, Item[] items){
        this.customer = c;
        this.items = items;
    }
    
    // Accessors and Mutators  
    public String getCustumer(){
        return customer;
    }
    
    public void setCustomer(String c){
        this.customer = c;
    }
    
    public Item[] getItems(){
        return items;
    }
    
    public void setItems(Item[] i){
        this.items = i;
    }
}
