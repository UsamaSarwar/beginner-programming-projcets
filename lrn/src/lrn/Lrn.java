package lrn;

public class Lrn {
    
  
    
    public static void main(String[] args) {
       employee ob = new employee("Hamza","Male","HOD",20,42535,2,35000);
       ob.diplay();
              System.out.println("\n");

        student ob1 = new student("Ali","Male","BSCS",19,139,1,76000);
       ob1.diplay();
                     System.out.println("\n");

        staff ob2 = new staff("Moman","Male","Accountent",26,24655,4,55000);
       ob2.diplay();
                     System.out.println("\n");

       person ob3 = new person();
       ob3.diplay();
        
        
    }
    
}
