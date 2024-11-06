/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labfinal;

/**
 *
 * @author Waleed Khan Sherwani
 */
public class Labfinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=0;
                int b=0;
                int c=0;
                double d=1;
        int [] arr={1,2,3,4,5,6,7,8,9,1};
        for (int i=0;i<=9;i++){
        a=arr[i]+a;
        b=arr[i]-b;
        c=arr[i]*c;
        d=arr[i]/d;
        
        }
        System.out.println("Sum of array\t"+a);
        System.out.println("Subract of array\t"+b);
        System.out.println("Multiply array\t"+c);
        System.out.println("Divide of array\t"+d);
       
    }
    
}
