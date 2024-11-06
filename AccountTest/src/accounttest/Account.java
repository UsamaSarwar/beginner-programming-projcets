/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounttest;

/**
 *
 * @author Tasib
 */
public class Account 
{
    private double balance;
    
    public Account (double initialBalance)
    {
        
        if(initialBalance > 0.0)
           balance = initialBalance;
    }

    
    public void credit(double amount)
    {
        
        balance = balance + amount;
        
    }
    
    
    public void debit(double amount)
    {
        if(amount > balance)
            System.out.println("Debit amount exceeded account balance.");
        
        else
            balance = balance - amount;
        
    }
    
    
    
    public double getBalance()
    {
        return balance;
    }
    
    
}
