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
public class Agrigation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        adress obj = new adress(1,"Waleed");
        student obj1= new student(1,"ali",obj);
        obj1.show();
    }
    
}
