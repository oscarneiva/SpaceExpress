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
public class Item {
    
    // Fields
    private String name;
    private String[] parts;
    private String weight;
    
    // Constructor
    public Item(String n, String w){
        this.name = n;
        this.weight = w;
    }
    
    // Accessors and Mutators
    public String getName(){
        return name;
    }
    
    public void setName(String n){
        this.name = n;
    }
    
    public String[] getParts(){
        return parts;
    }
    
    public void setParts(String[] p){
        this.parts = p;
    }
    
    public String getWeight(){
        return weight;
    }
    
    public void setWeight(String w){
        this.weight = w;
    }
}