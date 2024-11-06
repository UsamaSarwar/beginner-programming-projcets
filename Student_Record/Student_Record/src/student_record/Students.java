
package student_record;
import java.util.Scanner;


public class Students {
 private
         int rollno;
         double cgpa;
         String name;
         
 public
           Students () {}
           
          Students (int r, double c, String n) {
             
             rollno = r;
             cgpa = c;
             name = n;
         } 
                 
          Students (Students obj) {
              rollno = obj.rollno;
              cgpa = obj.cgpa;
              name = obj.name;
          }
          
              void showvalues () {
             System.out.println("Rollno "+rollno+"\n"+"cgpa "+cgpa+"\n"+"name "+name);
         }
         
      public  Students copy () {
            
            Students copyObject = new Students (rollno, cgpa, name);
            return copyObject;
        }
                 
      /*           
         void setrollno (int r) {
             rollno = r;
         }
    
         void setcgpa (double c) {
             cgpa = c;
         }
         
         void setname (String n) {
             name = n;
         }
    
         void setvalues (int r, double c, String n) {
             
             rollno = r;
             cgpa = c;
             name = n;
         }
         
         void getvalues () {
             
             Scanner temp = new Scanner(System.in);
             System.out.println ("Enter your rollno ");
             rollno = temp.nextInt();
             System.out.println ("Enter your cgpa ");
             cgpa = temp.nextDouble();
             // name = temp.nextLine();
             System.out.println ("Enter your Name ");
             name = temp.next();
             
             
         }
         
         void showrollno (int r) {
             int rollno;
             rollno = r;
             System.out.println("rollno showding "+rollno);
         } */
         
     
         
    
}
