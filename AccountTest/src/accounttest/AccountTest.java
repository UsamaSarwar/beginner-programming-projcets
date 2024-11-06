/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounttest;

import java.util.Scanner;

/**
 *
 * @author Tasib
 */
public class AccountTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Account account1 = new Account( 50.00 );
        Account account2 = new Account( -7.53 );
        
        System.out.println("account1 balance: $" + account1.getBalance());
        System.out.println("account2  balance: $" + account2.getBalance());
        System.out.println();
        Scanner input = new Scanner(System.in);
        double depositeAmount, debitAmount;
        
        System.out.print("Enter deposite amount for account1: $");
        depositeAmount = input.nextDouble();
        System.out.println();
        
        System.out.println("adding $" + depositeAmount + " to account1 balance.");
        account1.credit(depositeAmount);
        System.out.println();
        
        System.out.println("account1 balance: $" + account1.getBalance());
        System.out.println("account2 balance: $" + account2.getBalance());
        System.out.println();
        
        System.out.print("Enter deposite amount for account2: $");
        depositeAmount = input.nextDouble();
        System.out.println();
        
        System.out.println("adding $" + depositeAmount + " to account2 balance.");
        account2.credit(depositeAmount);
        System.out.println();
        
        System.out.println("account1 balance: $" + account1.getBalance());
        System.out.println("account2 balance: $" + account2.getBalance());
        System.out.println();
        
        System.out.print("Enter debit amount for account1: $");
        debitAmount = input.nextDouble();
        System.out.println();
        
        System.out.println("Subtracting $" + debitAmount + " from account1 balance.");
        account1.debit(debitAmount);
        System.out.println();
        
        System.out.print("Enter debit amount for account2: $");
        debitAmount = input.nextDouble();
        System.out.println();
        
        System.out.println("Subtracting $" + debitAmount + " from account2 balance.");
        account2.debit(debitAmount);
        System.out.println();
        
        System.out.println("account1 balance: $" + account1.getBalance());
        System.out.println("account2 balance: $" + account2.getBalance());
        
        
    }
    
}
