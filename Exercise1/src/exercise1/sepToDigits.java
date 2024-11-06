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
public class sepToDigits {
     public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);
        int num,a,b,c,d,e;

        System.out.print("Enter a 5 Digit Number: ");
        num = input.nextInt();

        a=num/10000;
        num=num%10000;
        b=num/1000;
        num=num%1000;
        c=num/100;
        num=num%100;
        d=num/10;
        num=num%10;
        e=num;


        System.out.println("The 5 Digits of Given Number is: " + a +"  "  + b +"  "  + c +"  "  + d +"  "  + e +"  " );
        
     }


}
