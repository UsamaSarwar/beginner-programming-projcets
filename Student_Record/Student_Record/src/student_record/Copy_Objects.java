
package student_record;

public class Copy_Objects {
    private
            int value1;
            int value2;
            
    public 
            Copy_Objects() {} //default constructor
            Copy_Objects (int v1, int v2) { //parameterized constructor
                value1 = v1;
                value2 = v2;
            }
    void show () {
        System.out.println ("value 1 "+ value1 + "\n"+"Value 2 "+value2);
    }
    
    Copy_Objects copy () {    //Copy method
        Copy_Objects copyObject = new Copy_Objects (value1, value2);
        return copyObject;
    }
    
    Copy_Objects (Copy_Objects obj) {
        value1 = obj.value1;
        value2 = obj.value2;
    }
    
    
    
}
