/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lrn;

import java.util.Scanner;

/**
 *
 * @author Obi
 */
public class staff extends person{
    
    int Sid;
    String SDestination;
    int Syearofworking;
    int salary;
    
    staff(String na,String gn,String des,int ag,int id,int yow,int sla){
        name= na;
        gender = gn;
        SDestination = des;
        Syearofworking = yow;
        Sid= id;
        age=ag;
        salary=sla;
    }
    
    void set(){
        Scanner in =  new Scanner(System.in);
        
        name=in.next();
        gender = in.next();
        age= in.nextInt();
        Sid = in.nextInt();
        SDestination = in.next();
        Syearofworking= in.nextInt();
        salary = in.nextInt();
    }
    
    @Override
    void diplay(){
        System.out.println("name is" + name+"\n gender is "+gender+"\nage is "+age
        +"\nEID is "+Sid+"\n Detination is "+SDestination+"\nYear of working " + 
                Syearofworking+"\nSalary is "+salary);
    }
    
}
