/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceexpress;

/**
 *
 * @author oscar neiva
 */
public class Order {
    // Fields
    private int id;
    private String name;
    private float weight;
    
    // Constructor
    public Order(int i, String n, float w){
        this.id = i;
        this.name = n;
        this.weight = w;
    }
    
    // Access Modifiers
    public int getId(){
        return id;
    }
    
    public void setId(int i){
        this.id = i;
    }
    
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
