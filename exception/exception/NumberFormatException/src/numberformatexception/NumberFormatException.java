
package numberformatexception;

import java.util.Scanner;

public class NumberFormatException {

    public static void main(String[] args) {
    int a,b;
    Scanner opp=new Scanner(System.in);
    try{
        System.out.println("enter 2 no.");
        a=Integer.parseInt(opp.next());
        b=Integer.parseInt(opp.next());
        System.out.println("a "+a);
        System.out.println("b "+b);
    }
    catch(Exception e){
        System.out.println("NumberFormatException");
    }
    }
    }
