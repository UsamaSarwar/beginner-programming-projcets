
package arithmaticexception;

import java.util.Scanner;

/*import java.util.*;*/
public class Arithmaticexception {

    public static void main(String[] args) {
        int a,b,sum;
    Scanner obl=new Scanner(System.in);
    try{
        System.out.println("1st no.");
        a=obl.nextInt();
        System.out.println("2nd no.");
        b=obl.nextInt();
         sum=a/b;
        System.out.println("sum="+sum);
    }
    catch(Exception e){
        System.out.println("impossible");
    }
    }}
    

