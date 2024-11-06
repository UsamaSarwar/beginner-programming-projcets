/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg3;

/**
 *
 * @author Waleed Khan Sherwani
 */
public class Duplicate {
double OOP(int a[],int s) throws Exception{
    
    a=new int[s];int t=0;
    for(int b=0;b<s;b++){
        t=t+a[b];
    }
    return t/s;
    
}
double OOP(double a[],int s) throws Exception{
    
    a=new double[s];double t=0;
    for(int b=0;b<s;b++){
        t=t+a[b];
    }
    return t/s;
    
    

    
}
    public static void main(String[] args) {
        Duplicate o = new Duplicate();
        try{
            int a[]={1,2,3,4,5,6,7,8,9,10};
            System.out.println(o.OOP(a, a.length));
        }catch(Exception e){
            
        }
    }
    
}
