/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab2;

import java.util.Scanner;

/**
 *
 * @author RonAld00
 */
public class pizza {
    
    private double bill,lpizza,spizza,quan;
    String wp;
    public pizza()
    {
        bill=0.0;
       
        spizza=590;
        quan=0.0;
        lpizza=1600;
        wp="";
        
    }
    void display()
    {
        System.out.println("Welcome to pizza hut");
        System.out.println("Large Pizza Price=1600");
        System.out.println("Small Pizza Price=560");
        
        
    }
    void order()
    {
        System.out.println("Which Pizza you want to buy?");
        System.out.println("Enter Large For Large Pizza and Enter Small for Small Pizza");
        Scanner in=new Scanner(System.in);
        wp=in.next();
        
            System.out.println("How many do you want to buy?");
            quan=in.nextDouble();
      
        }
    void bill()
    {
        if(wp.equalsIgnoreCase("large"))
        {
            bill=quan*lpizza;
        }
        else
            bill=quan*spizza;
        System.out.println("Bill="+bill);
    }
}
