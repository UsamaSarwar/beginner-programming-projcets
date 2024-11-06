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

public class employee extends person{
    
    int eid;
    String Destination;
    int yearofworking;
    int salary;
    
    employee(String na,String gn,String des,int ag,int id,int yow,int sla){
        name= na;
        gender = gn;
        Destination = des;
        yearofworking = yow;
        eid= id;
        age=ag;
        salary=sla;
    }
    
    void set(){
        Scanner in =  new Scanner(System.in);
        
        name=in.next();
        gender = in.next();
        age= in.nextInt();
        eid = in.nextInt();
        Destination = in.next();
        yearofworking= in.nextInt();
        salary = in.nextInt();
    }
    
    @Override
    void diplay(){
        System.out.println("name is" + name+"\n gender is "+gender+"\nage is "+age
        +"\nEID is "+eid+"\n Detination is "+Destination+"\nYear of working " + 
                yearofworking+"\nSalary is "+salary);
    }
}
