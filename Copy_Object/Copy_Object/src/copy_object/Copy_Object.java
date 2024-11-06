package copy_object;

public class Copy_Object {

    public static void main(String[] args) {
       
        data obj1 = new data ( 10, 20);
        data obj2 = new data (obj1); //obj1 is copied value through constructor
        obj2.show();
        
//        data obj3 = new data (4, 5); 
//        data obj4;        
//        obj4= obj3.copy();  //obj3 is copied value through method
//        
//        obj4.show();
        
        
    }
    
}

