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
public class student extends person {
    int sid;
    String sdegree;
    int csemester;
    int fee;
    
    student(String na,String gn,String des,int ag,int id,int yow,int sla){
        name= na;
        gender = gn;
        sdegree = des;
        csemester = yow;
        sid= id;
        age=ag;
        fee=sla;
    }
    
    void set(){
        Scanner in =  new Scanner(System.in);
        
        name=in.next();
        gender = in.next();
        age= in.nextInt();
        sid = in.nextInt();
        sdegree = in.next();
        csemester= in.nextInt();
        fee = in.nextInt();
    }
    
    @Override
    void diplay(){
        System.out.println("name is" + name+"\n gender is "+gender+"\nage is "+age
        +"\nSID is "+sid+"\n Student degree is "+sdegree+"\nCurrent semester " + 
                csemester+"\nFee is "+fee);
    }
}
