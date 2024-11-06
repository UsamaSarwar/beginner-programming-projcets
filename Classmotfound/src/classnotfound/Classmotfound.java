/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classnotfound;



/**
 *
 * @author Waleed Khan Sherwani
 */
public class Classmotfound {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try {
    Class.forName("oracle.jdbc.OracleDriver");
} catch (ClassNotFoundException e) {
    System.out.println("Error: unable to load driver class!");
    System.exit(1);
}
    }
    
}
