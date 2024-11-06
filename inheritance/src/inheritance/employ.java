/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Shahid Hussain
 */
public class employ extends person{
    public  employ(){
    

   super("momin",18,"male");
   
}
    public void data(double eid,String designation,double ywork,double salary){
        System.out.println("eid of the employ is "+eid+"\n "+"designation of the employ is"+designation+"\n"+"working of the year is"+ywork+"\n"+"salary of the employ is"+salary);
        
    }
}


