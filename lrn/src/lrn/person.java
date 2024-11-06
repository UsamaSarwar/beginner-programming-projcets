/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lrn;

/**
 *
 * @author Obi
 */
public class person {
    String name,gender;
    int age;
    
    person(){
        name = "Waleed";
        age= 18;
        gender = "male";
    }
    person(String a, String b,int c){
        name=a;
        gender=b;
        age=c;
    }
    
    void diplay(){
        System.out.println("name is" + name+"\n gender is "+gender+"\nage is "+age);
    }
    
}
