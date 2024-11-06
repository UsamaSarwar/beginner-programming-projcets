/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gasmilage;

import java.util.Scanner;

/**
 *
 * @author Tasib
 */
public class GasMilage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int miles,gal, tMiles=0, tGal=0;
        float avg, tAvg;
        
        int i=1;
        while (i!=0)
        {
            
            System.out.println("Enter Miles and Gallons Used in Trip " + i + ": ");
            
            System.out.print("Miles: ");
            miles = input.nextInt();
            tMiles+=miles;
            
            System.out.print("Gallons: ");
            gal = input.nextInt();
            tGal+= gal;
            
            avg = (float) miles/gal;
            
            System.out.println("Average Milage for Trip " + i + " is: " + avg + " Miles per Gallon.");
            
            System.out.println("Press '1' to continue or '0' to exit: ");
            i = input.nextInt();
            System.out.println("");System.out.println("");
        }
        
        
        tAvg = tMiles/tGal;
        
        System.out.println("\n\nAverage Milage for the whole Journey is: " + tAvg + "Miles per Gallon.");
        
        
        
    }
    
}
