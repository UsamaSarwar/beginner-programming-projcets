
package arrayindexoutofboundsexception;

import java.util.Scanner;
public class ArrayIndexOutOfBoundsException {

    public static void main(String[] args) {
    
        Scanner o=new Scanner(System.in);
        int index=o.nextInt();
        try{
           int arry[]={55,23,22};
           System.out.println(arry[index]);
        }
        catch(Exception e){
            System.out.println("wrong input");
        }
       
    }  
}
