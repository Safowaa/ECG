/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MissSafowaa
 */
import java.text.NumberFormat;
import javax.swing.JOptionPane;
public class ddd {
    public static void main(String []args){
//        A program that calculates the bill for the month
         NumberFormat currency = NumberFormat.getCurrencyInstance();
        try{
        double kw;
        double amount;
        JOptionPane.showMessageDialog(null, "Welcome To Electricity Tariff Calculator");
        kw = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter kilowatt consumed."));
        double firstamount = 50 * 0 + 20 * 0.52 + 50 * 0.95;
        double restamount = kw - 120;
        amount = restamount * 1.02 + firstamount ;
        
        
        JOptionPane.showMessageDialog(null," Amount Due " + currency.format(amount));
                   
        
    
        }catch (Exception kw) {
             JOptionPane.showMessageDialog(null, "ONLY NUMBERS!"); } 
        
    }
    
}
