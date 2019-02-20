/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

//import org.apache.commons.csv.CSVFormat;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//import org.apache.commons.csv.CSVParser;
//import org.apache.commons.csv.CSVRecord;


/**
 *
 * @author oscar neiva
 */
public class OrderManager {
    // Fields
    //private static final String SAMPLE_CSV_FILE_PATH = "./users.csv";
    
    // Constructor
    public OrderManager(){

    }
    
    public void readOrder(){
        System.out.println("User reading order...");
    }
   
    public void printTest(){// It works!!!
        String fileName = "./data/orders.csv";
        File file = new File(fileName);
        try{
            Scanner inputStream = new Scanner(file);
            //inputStream.next(); //ignore the first line
            while(inputStream.hasNext()){
                //Data, contains all the data in the file
                String data = inputStream.next();
                //Values, to select specific data from the file
                String[] values = data.split(",");
                System.out.println(values[1]);
            }
            inputStream.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
