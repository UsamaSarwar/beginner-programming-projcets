
package student_record;

public class Class {
    
    private 
            String class_name;
            Instructor instructor;
            Students student;
            
   public 
           Class (String n, Instructor i, Students s) {
               class_name = n;
               
               instructor = new Instructor (i);
               student = new Students (s);
               
              
           }
           
           void show () {
               System.out.println ("Class Name"+class_name);
               System.out.println ("Instructor name"+instructor.lname +"\n"+"Instructor Major"+instructor.major);
               System.out.println ("Student name"+student.name);
           }
    
}
