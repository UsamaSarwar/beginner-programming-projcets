/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop;

import java.util.Scanner;

/**
 *
 * @author Waleed Khan Sherwani
 */
public class Loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
        
    int a, b, c;
    
    System.out.println("Enter Value for A: " );
    
    a = input.nextInt();
    
    System.out.println("Enter Value for B: " );
    
    b = input.nextInt();
    
    c = a+b;
    
    System.out.println("Sum of A + B: " + c );
    
    System.out.println("Sum of A + B without c: " + (a+b) );
    
    
       
        
    }
    
}
