
package illegal;

import java.util.Scanner;

public class Illegal {

    public static void main(String[] args) {
    Scanner op=new Scanner(System.in);
    System.out.println("enter no.");
    try{
        int x=op.nextInt();
        System.out.println("no.="+x);
    }
    catch(Exception e){
    System.out.println("illegal");
    }   
}
}