/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.newmanhw;

import java.util.Scanner;
/**
 *
 * @author MissSafowaa
 */
public class homwwork {
    public static void main(String[] args){
             double state_tax = 0.055;
             double country_tax = 0.02;
        
          Scanner did = new Scanner(System.in);
          
            System.out.println("Please enter the amount of purchase");
          
              double amount = did.nextDouble();
              
            System.out.println("amount is " + amount);
         
              double total = amount + state_tax + country_tax;
            System.out.println("The state tax is " + state_tax + 
                                ", \nThe country sales tax is " 
                                + country_tax + "\nTotal is " + total);
            
        
    }
}
