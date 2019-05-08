/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import modules.Order;
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
    private LinkedList<Order> orders;
    
    public OrderManager(){
    
    }
    
    // Load all the users in RAM when initializing the program.
    public void loadAllOrders() throws IOException{
        FileReader fileReader = new FileReader("./data/orders.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        
        String fileContent; 
        while((fileContent = bufferedReader.readLine()) != null) { 
            String[] fileData = fileContent.split(",");
            String[] fileArray = fileData[1].split("[,]");
            
            System.out.print(fileArray);
            //order = new Order(fileData[0], fileData[1]);
            //orders.add(order);
        }
            
        fileReader.close();
    }
}
