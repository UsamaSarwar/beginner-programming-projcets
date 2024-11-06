
package name;

import java.util.Scanner;


public class Name {
    private 
            String name;
    void display (name){
        String display;
        System.out.println("your name is"+name);
    }

  
    public static void main(String[] args) {
     Scanner a = new Scanner(System.in);
         
     System.out.println("what is your name:");
     String name = a.nextLine();
         
     System.out.println(name);
     name obj= new name();
     obj.display(name);
     
       Scanner b= new Scanner(System.in);
    System.out.println("what your sceond name");
    String name1 = b.nextLine();
    name1 obj1 = new name1();
    obj1.name11(name1);
    }
    
}
