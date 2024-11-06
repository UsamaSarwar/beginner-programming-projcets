
package joption;

import javax.swing.JOptionPane;


public class Joption {

   
    public static void main(String[] args) {
        String name;
        String temp;
        int x,y,z;
        int a;
        temp=JOptionPane.showInputDialog("Enter the first number:");
        x=Integer.parseInt(temp);
        temp=JOptionPane.showInputDialog("Enter the second number:");
        y=Integer.parseInt(temp);
        
        name=JOptionPane.showInputDialog("Enter for the operation : \n 1 for addition \n 2 for subraction\n 3 for multiplication\n 4 division");
        a=Integer.parseInt(name);
        switch(a){
            case 1:
                int l;
                l=x+y;
                addition obj= new addition();
                obj.addition(l);
                break;
            case 2:
                int b;
                b=x-y;
                addition obj1 =new addition();
                obj1.subraction(b);
                break;
            case 3:
                int v;
                v=x*y;
                addition obj2 = new addition();
                obj2.multiply(v);
                break;
            case 4:
                 int t;
                t =x/y;
                addition obj3 = new addition();
                obj3.division(t);
                break;
                
        }
        
        
        
       
        
        
        }
    
}
