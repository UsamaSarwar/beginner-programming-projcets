
package practice;

import java.util.Scanner;

public class Practice {
private
    int a;
    int b;
    int c;
    public
            void c(int x,int y){
            a=x;
            b=y;
            c=a+b;
            System.out.println("The sum of a and b is:"+c);
            }
    
    public static void main(String[] args) {
         System.out.println("enter values a and b:");
        Scanner a= new Scanner(System.in);
        int x,y;
        x=a.nextInt();
        y=a.nextInt();
        Practice obj = new Practice();
        obj.c(x,y);
        
        
    
       
        
        
    }
    
}
