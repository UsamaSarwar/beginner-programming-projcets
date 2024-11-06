
package copy_object;

public class data {
    
    private
            int value1;
            int value2;
    public 
            data () {} //default constructor
            data (int v1, int v2) {    //parameterized constructor
                value1 = v1;
                value2 = v2;
            }
            
            data copy () {   //Method that is copying one object to another object
                data copyobject = new data (value1, value2);
                return copyobject;
            }
            
            data (data ob) {   //Constructor that is copying one object to antoher object
                value1 = ob.value1;
                value2 = ob.value2;
            }
            
            
            
            void show () {
                System.out.println ("Value1 " +value1+" Value2 " +value2);
            }
}
