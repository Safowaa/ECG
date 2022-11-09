/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reclasswork;

/**
 *
 * @author MissSafowaa
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class start {
    public static void main(String[] args){
//        System.out.println("hello world");

/*double length = 2.5;
double width = 2.0;
double area = length * width;
System.out.println("your area is " + area);*/
        
       /* Scanner pop = new Scanner(System.in);
        System.out.println("please eneter your length");
        double length = pop.nextDouble();
        System.out.println("please enter your width");
        double width = pop.nextDouble();
        double area = width*length;
        System.out.println("Your area is " + area);*/
       
       
//       JOptionPane.showMessageDialog(null,"Message");

/*float length = Float.parseFloat(JOptionPane.showInputDialog("Enter length"));
        int width = Integer.parseInt(JOptionPane.showInputDialog("Enter width"));
        double area = length*width;
        JOptionPane.showMessageDialog(null, "Length =" + length +
                                        "\nWidth =" + width+
                                        "\nArea = " + area);*/
          /*int again = 1;
        while(again==1) {
            Scanner mm = new Scanner(System.in);
            float marks, total = 0, min = 100, max = 0, avg;
            for (int k = 0; k < 8; k++) {
                System.out.println("Enter mark " +(k+1) + ":");
                marks = mm.nextFloat();
                total += marks;  //total = total + marks
//        max
                if (marks > max)
                    max = marks;
//        min
                if (marks < min)
                    min = marks;
            }
            avg = total / 8;
            System.out.println("Total = " + total + "\nAvg = " + avg +
                    "   \nMax = " + max + "  \nMin = " + min);
            System.out.println("\nEnter 1 to continue...");
            again = mm.nextInt();
        
        
                          }*/
        
        
        
     float again=JOptionPane.YES_OPTION;
     while (again == JOptionPane.YES_OPTION)
     {
         
         float marks, total = 0, min = 100, max = 0, avg;
         for (int k = 0; k < 8; k++) {
             float mm = Float.parseFloat(JOptionPane.showInputDialog("Enter mark " + (k+1) + ":"));
             marks = mm;
             
             total += marks;
          
             if (marks > max)
                 max = marks;
             
             if (marks < min)
                 min = marks;
     }
         avg = total / 8;
         JOptionPane.showMessageDialog(null,"total = " + total+ "\nAvg = " + avg +
                                             "\nMax = " + max + "\nMin = " + min);
          
         again = JOptionPane.showConfirmDialog(null, "\nEnter Yes to continue... " ,"exiting", JOptionPane.YES_NO_OPTION);
         
        
     }
    }
}
