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
public class NegPosZero {


 public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        int val1, val2, val3, val4, val5;
        int pos=0, neg=0, zero=0;

        System.out.print("Enter Value # 1: ");
        val1 = input.nextInt();


        if (val1>0)
            pos++;

        else if(val1==0)
            zero++;

        else
            neg++;


        System.out.print("Enter Value # 2: ");
        val2 = input.nextInt();

        if (val2>0)
            pos++;

        else if(val2==0)
            zero++;

        else
            neg++;


        System.out.print("Enter Value # 3: ");
        val3 = input.nextInt();

        if (val3>0)
            pos++;

        else if(val3==0)
            zero++;

        else
            neg++;


        System.out.print("Enter Value # 4: ");
        val4 = input.nextInt();

        if (val4>0)
            pos++;

        else if(val4==0)
            zero++;

        else
            neg++;


        System.out.print("Enter Value # 5: ");
        val5 = input.nextInt();

        

        if (val5>0)
            pos++;
        
        else if(val5==0)
            zero++;
        
        else
            neg++;

     
         System.out.println("Number of Positive Values is: " + pos);

         System.out.println("Number of Negative Values is: " + neg);

         System.out.println("Number of Zero Values is: " + zero);

    }



    

}
