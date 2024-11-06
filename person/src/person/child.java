/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author Waleed Khan Sherwani
 */
public class child extends Person1{
    public child() {
        super("waleed",18,"Male");
    }
    public child(int id,String a, int b,int c){
        System.out.println("Your id is"+id+"\nYour Designation"+a"\nYour year of Working"+b+"\nYour Salary"+c);
    }
}
