
package student_record;


public class Student_Record {

    
    public static void main(String[] args) {
        
       Students std1 = new Students(1, 2.7, "Ali"); 
       Instructor inst1 = new Instructor ("Ali", "Lodhi", "Networks");
       Class cls1 = new Class ("CS4", inst1, std1);
   
       
//  Students std2 = new Students (std1);


    //Students std2 = std1.copy();
      // std1.showvalues();
       //std2.showvalues();
       
      // System.out.println("Values in std1 "+std1);
       //System.out.println("Values in std2 "+std2);
       
       
       //Students std2 = new Students (std1);
      
       
       
       
      // cls1.show();
       
       
       
      
      //std2.setvalues (1,2.7,"Ali");
      //std1.setvalues (1,2.7,"Ali");
      
     //std2 = std1; 
     //std2 = std1.copy();
     
   //  System.out.println("Std1: "+std1);
    // System.out.println("Std2: "+std2);
     
     
    /* if (std2==std1) 
         System.out.println("Std and Std2 reference to same object");
     else 
         System.out.println ("Std and Std2 reference to different object"); */
      
      
      
       /* std1.setrollno(1);
       std1.setcgpa(3.0);
       std1.setname("ALi");
       
       std1.showvalues();
       Students std2 = new Students ();
       
       std2.setvalues(2, 2.7, "ABC");
       std2.showvalues();
       
       Students std3 = new Students ();
       std3.getvalues();
       std3.showvalues(); */
      
               
    }
    
}
