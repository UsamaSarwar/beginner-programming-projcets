/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sess;

import java.util.Scanner;

/**
 *
 * @author Waleed Khan Sherwani
 */
public class account {
   String name ;
   int id;
   String type;
   
   
   void getvalue(){
       System.out.println("enter your name");
       Scanner b= new Scanner(System.in);
       name = b.next();
         System.out.println("enter your id");
         id= b.nextInt();
         System.out.println("enter your type");
         type = b.next();
}
    account(){
       }
   void display(){
       System.out.println("name"+name+"id"+id+"type"+type);
   }
}
