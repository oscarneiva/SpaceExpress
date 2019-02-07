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
    private int id;
    private String customer;
    private Item[] items;
    
    // Constructor
    public Order(int i, String c, Item[] items){
        this.id = i;
        this.customer = c;
        this.items = items;
    }
    
    // Access Modifiers
    public int getId(){
        return id;
    }
    
    public void setId(int i){
        this.id = i;
    }
    
    public String getCustumer(){
        return customer;
    }
    
    public void setCustomer(String c){
        this.customer = c;
    }
    
    public Item[] getItems(){
        return items;
    }
    
    public void setItems(int items){
        this.id = items;
    }
}
