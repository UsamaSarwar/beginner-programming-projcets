/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise1;

import java.util.Scanner;

/**
 *
 * @author Tasib
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        int val1, val2, val3, val4, val5;
        int min, max;

        System.out.print("Enter Value # 1: ");
        val1 = input.nextInt();


        System.out.print("Enter Value # 2: ");
        val2 = input.nextInt();


        System.out.print("Enter Value # 3: ");
        val3 = input.nextInt();


        System.out.print("Enter Value # 4: ");
        val4 = input.nextInt();


        System.out.print("Enter Value # 5: ");
        val5 = input.nextInt();


            min=val1;

        if (min>val2)
            min=val2;

        if (min>val3)
            min=val3;

        if (min>val4)
            min=val4;

        if (min>val5)
            min=val5;


         System.out.println("Minimum Value is: " + min);


            max=val1;

        if (max<val2)
            max=val2;

        if (max<val3)
            max=val3;

        if (max<val4)
            max=val4;

        if (max<val5)
            max=val5;


         System.out.println("Maximum Value is: " + max);


        
    }

}
