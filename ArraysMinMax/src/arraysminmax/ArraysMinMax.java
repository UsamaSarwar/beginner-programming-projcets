
package arraysminmax;

import java.util.Scanner;

/**
 *
 * @author Tasib
 */
public class ArraysMinMax 
{

    
    public static void main(String[] args) 
    {
        float weight, age;
        int days, months=3, years=2;
        
        
        
        int[] Tasib;
        
        int a,b,min,max,temp,sum=0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Size of Array: ");
        a = input.nextInt();
        
        Tasib = new int [a];
        
        for (b=1; b<=a; b++)
        {
            System.out.print("Enter Value# " + b + ": ");
            Tasib[b-1]=input.nextInt();
            sum += Tasib[b-1];
        }
        
        min = Tasib[0];
        
        for(b=1; b<a; b++)
        {
            if(Tasib[b]<min)
            {
                temp = Tasib[b];
                Tasib[b] = min;
                min = temp;
            }
            
        }
        
        System.out.println("\nMinimum of these values is:  " + min);
        
        
        max = Tasib[0];
        
        for(b=1; b<a; b++)
        {
            if(Tasib[b]>max)
            {
                temp = Tasib[b];
                Tasib[b] = max;
                max = temp;
            }
            
        }
        
        System.out.println("\nMaximum of these values is:  " + max);
        
        System.out.println("\nSum of these values is:  " + sum);
        System.out.println();
        
    }
    
}
