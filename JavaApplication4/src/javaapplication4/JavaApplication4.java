

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author Waleed Khan Sherwani
 */
public class JavaApplication4 {

     private 
     int a;
     int b;
     int sum;
     int sub;
     int mul;
     float div;
     
     public 
             void sum(int x,int y){
                 a=x;
                 b=y;
                 sum= a+b;
                  System.out.println("your sum is: "+sum);               
             }
             void sub(int x,int y){
                 a=x;
                 b=y;
                 sub= a-b;
                  System.out.println("your sub is: "+sub);               
    
}
                  void mul(int x,int y){
                 a=x;
                 b=y;
                 mul= a*b;
                  System.out.println("your mul is: "+mul);  
                  }
                  
                  void div(int x,int y){
                 a=x;
                 b=y;
                 div= a/b;
                  System.out.println("your div is: "+div);  
                  }
                  
    
     
    public static void main(String[] args) {
        System.out.println("your value is: ");
        Scanner b= new Scanner(System.in);
        int w;
        int e;
                
        w=b.nextInt();
        e=b.nextInt();
        JavaApplication4 obj =new JavaApplication4();
        obj.sum(w,e);
        obj.sub(w,e);
        obj.mul(w,e);
        obj.div(w,e);
        
        
       }

    
}
