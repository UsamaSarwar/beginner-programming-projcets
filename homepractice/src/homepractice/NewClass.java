
package homepractice;

import java.util.Scanner;


public class NewClass {
    private
            int rollno;
    double cgpa;
    String name;
    
    
    void callvalues(){
        for(int a=1;a<=2;a++){
        Scanner b= new Scanner(System.in);
        System.out.println("Enter the name:");
        name=b.next();
       System.out.println("Enter the rollno:");
        rollno=b.nextInt();
         System.out.println("Enter the cgpa:");
        cgpa=b.nextDouble();}
    }
    void showvalues(){
        for (int a=1;a<=2;a++){
        System.out.println("name="+name+"\n"+"rollno"+rollno+"\n"+"cgpa"+cgpa+"\n");}
    }
}
