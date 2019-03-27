/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 *
 * @author oscar neiva
 */
public class OrderManager {
    // Fields
    private int ordersSize;
    
    // Constructor
    public OrderManager(){
        ordersSize = 0;
    }
    
    public void countOrders(){
        ordersSize++;
    }
    
    public int getOrdersSize(){
        return ordersSize;
    }
    
    public String[] readOrder(){
        System.out.println("User reading order...");
        String data = ""; // To be moved to the constructor
        String fileName = "./data/orders.csv";
        File file = new File(fileName);
        String[] values = null;
        try{
            Scanner inputStream = new Scanner(file);
            inputStream.next(); //ignore the first line
            while(inputStream.hasNext()){
                //Data, contains all the data in the file
                data = inputStream.next();
                countOrders();
                //Values, to select specific data from the file
                values = data.split(",");
                //System.out.println(values[1]);
            }
            inputStream.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        return values;
    }
}
