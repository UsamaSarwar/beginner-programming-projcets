/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

import java.util.Scanner;

/**
 *
 * @author Tasib
 */
public class estPopGrowth {
    
    public static void main(String[] args)
    {

        //Scanner input = new Scanner(System.in);
        long  population, newPopulation;
        double rate;
       
        
        newPopulation = 736989651;//input.nextInt();
        rate = 1.14/100;
        
        
            population= (long) (newPopulation*rate);

            newPopulation = newPopulation + population;

            System.out.println("World Population After Year 1 will be: " + newPopulation  + " People. ");

             population= (long) (newPopulation*rate);

            newPopulation = newPopulation + population;

            System.out.println("World Population After Year 2 will be: " + newPopulation  + " People. ");

             population= (long) (newPopulation*rate);

            newPopulation = newPopulation + population;

            System.out.println("World Population After Year 3 will be: " + newPopulation  + " People. ");

             population= (long) (newPopulation*rate);

            newPopulation = newPopulation + population;

            System.out.println("World Population After Year 4 will be: " + newPopulation  + " People. ");

             population= (long) (newPopulation*rate);

            newPopulation = newPopulation + population;

            System.out.println("World Population After Year 5 will be: " + newPopulation  + " People. ");

            
        
        
        
        
    }
    
    
    
}
