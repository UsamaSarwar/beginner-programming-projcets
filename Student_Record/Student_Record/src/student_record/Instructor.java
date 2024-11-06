
package student_record;

public class Instructor {
    private
            String fname;
            String lname;
            String major;
    public 
            Instructor () {}
            
            Instructor (String f, String l, String m) {
                fname = f;
                lname = l;
                major = m;
            }
            
            
            
            Instructor (Instructor obj) {
               lname = obj.lname;
                fname = obj.fname;
                
                major = obj.major;
                
            }
            
            
    
            void setvalues (String f, String l, String m) {
                 fname = f;
                lname = l;
                major = m;
                
            }
    
            void show () {
                System.out.println ("First Name "+fname +"\n"+"Last Name "+lname+"\n"+"Major "+major);
            }
    
    
}
