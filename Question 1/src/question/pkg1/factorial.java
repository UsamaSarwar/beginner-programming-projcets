/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg1;

/**
 *
 * @author Waleed Khan Sherwani
 */
public class factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double i[]={1,2,3,4,5,6,7,8,9,10};
      double total = 0;
      for(int b=0;b<10;b++){
          total=total+i[b];
          System.out.println(total);
          
      }
      for (int b=0;b<10;b++){
          total=i[b]*total;
          System.out.println(total);
      }
      for (int b=0;b<10; b++){
          total=i[b]-total;
          System.out.println(total);
      }
      
    }
    
}
