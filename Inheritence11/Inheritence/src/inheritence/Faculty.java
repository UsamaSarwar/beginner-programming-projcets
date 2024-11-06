
package inheritence;


public class Faculty extends employees {
    private 
            String major;
            int no_of_publication;
            String type;
    public 
            Faculty () {}
            Faculty (int id, String name, String dept, String scale, String maj, int no, String typ){
            major = maj;
            no_of_publication = no;
            type = typ;
            
            set_employees(id,  name,  dept,  scale); 
            }
            
            void set_Faculty (int id, String name, String dept, String scale, String maj, int no, String typ){
            major = maj;
            no_of_publication = no;
            type = typ;
            
            set_employees(id,  name,  dept,  scale); 
            }
            
            void show_faculty () {
            show();
            System.out.println ("Major "+major+ "\nPublication "+no_of_publication+ "\ntype "+ type);
   
                
                
            }
    
}
