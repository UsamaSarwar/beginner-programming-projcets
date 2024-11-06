
package constructor;


public class Constructor {
int a, b, c;
	
	Constructor() {
		
		System.out.println("Constructor");
		
		a = 11;
		b = 20;
		c = a + b;
	}
	
	void display() {
		
		System.out.println("The Addition is : " + c);
	}
}
 
class MainClass {
   
    public static void main(String[] args) {
        Constructor obj = new Constructor();
		
		obj.display();
    }
    
}
