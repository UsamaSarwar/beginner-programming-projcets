/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab2;

/**
 *
 *@author Waleed Khan Sherwani
 */
public class Javalab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        pizza pi=new pizza();
        pizza pi1=new pizza();
        pi.display();
        pi.order();
        pi.bill();
         pi1.display();
        pi1.order();
        pi1.bill();
    }
    
}
