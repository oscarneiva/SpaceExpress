/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import modules.Order;
import modules.Item;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;


/**
 *
 * @author oscar neiva
 */
public class OrderManager {
    private Order order;
    private Item item;
    private LinkedList<Order> orders;
    private LinkedList<Item> items;
    
    public OrderManager(){
        items = new LinkedList<Item>();
    }
    
    // Load all the items and orders in RAM when initializing the program.
    public LinkedList<Item> loadAllOrders() throws IOException{
        FileReader fileReader = new FileReader("./data/items.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        
        String fileContent; 
        while((fileContent = bufferedReader.readLine()) != null) { 
            String[] fileData = fileContent.split(",");
            item = new Item(fileData[0], fileData[1]);
            items.add(item);
        }
        fileReader.close();
        
        return items;
    }
}
