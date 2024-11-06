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
public class oddEven {


 public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        int val;



        System.out.print("Enter a Number: ");
        val= input.nextInt();

        
        if(val%2!=0)
        System.out.println("Number is Odd.");

        else
        System.out.println("Number is Even.");



    }


    

}
