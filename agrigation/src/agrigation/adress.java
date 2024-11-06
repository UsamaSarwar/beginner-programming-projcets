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
public class adress {
    private
            int student;
            String name;
            adress(){}
           adress(int c,String n){
            student=c;
            name=n;
            
            }
     adress(adress obj){
    student=obj.student;
    name=obj.name;
    
    }
            public void show(){
            System.out.println("student"+student+"\nname"+name);
           
            }
}
