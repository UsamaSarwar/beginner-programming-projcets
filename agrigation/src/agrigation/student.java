/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agrigation;

/**
 *
 * @author Waleed Khan Sherwani
 */
public class student {
    private 
            int rollno;
            String name;
            adress obj;
         
            student(){}
     student(int r,String a,adress o){
    rollno=r;
    name=a;
    obj=o;
    
    
    }
     public void show(){
            System.out.println("rollno"+rollno+"\nname"+name+"\nadress"+obj);
            obj.show();
            }
}
