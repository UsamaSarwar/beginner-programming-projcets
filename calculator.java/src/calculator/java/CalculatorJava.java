
package calculator.java;

import java.util.Scanner;


public class CalculatorJava {

     private 
     int a;
     int b;
     
     public 
             void cal(int x,int y){
                 a=x;
                 b=y;
                  System.out.println("your value is "+ a +"  "+ b);               
    
}
     
    public static void main(String[] args) {
        System.out.println("your value is: ");
        Scanner b= new Scanner(System.in);
        int w;
        int e;
                
        w=b.nextInt();
        e=b.nextInt();
        CalculatorJava obj =new CalculatorJava();
        obj.cal(w,e);
        
        obj.cal(w,e);
    }
}
