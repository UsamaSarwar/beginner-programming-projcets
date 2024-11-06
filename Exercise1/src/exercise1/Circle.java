/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Circle {

     public static void main(String[] args)
    {
        double pi=3.14159;

        Scanner input = new Scanner(System.in);
        double r,d,cir,area;

        System.out.print("Enter Radius: ");
        r = input.nextInt();

        d= 2*r;
        cir= 2*pi*r;
        area= pi*r*r;
        
        System.out.println("Diameter: " + d);
        System.out.println("Circumference: " + cir);
        System.out.println("Area: " + area);

     }

}
