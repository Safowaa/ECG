/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tonybook;

/**
 *
 * @author MissSafowaa
 */
public class chaptertwo {
    public static void main(String[]args){
        
    double regularWages;
    double basePay = 25;              // The base pay rate.
    double regularHours = 40;         // The hours worked less overtime.
    double overtimeWages;             // Overtime wages
    double overtimePay = 37.5;        // Overtime pay rate
    double overtimeHours = 10;        // Overtime hours worked
    double totalWages;                // Total wages
    
    
  regularWages = basePay * regularHours;
  
  overtimeWages = overtimePay * overtimeHours; 
  
  totalWages = regularWages + overtimeWages;
  
  System.out.println("Wages for this week are $" + totalWages);
  
  
  
  double monthlyPay = 6000.0;
  double contribution;
 
  // Calculate and display a 5% contribution.
  
  contribution = monthlyPay * 0.05;
 System.out.println("5 percent is $" + contribution + " per month.");
 
  // Calculate and display a 8% contribution.
  
  contribution = monthlyPay * 0.08;
  System.out.println("8 percent is $" + contribution + " per month.");
 
  // Calculate and display a 10% contribution.
  
  contribution = monthlyPay * 0.1;
  System.out.println("10 percent is $" + contribution + " per month."); 
  
    }
    
}
