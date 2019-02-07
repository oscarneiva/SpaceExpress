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
public class Item {
    // Fields
    private String name;
    private float weight;
    
    // Constructor
    public Item(String n, float w){
        this.name = n;
        this.weight = w;
    }
    
    // Access Modifiers
    public String getName(){
        return name;
    }
    
    public void setName(String n){
        this.name = n;
    }
    
    public float getWeight(){
        return weight;
    }
    
    public void setWeight(float w){
        this.weight = w;
    }
}
