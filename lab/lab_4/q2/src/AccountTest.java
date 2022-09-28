package lab.lab_4.q2.src;

import java.util.Scanner;

public class AccountTest 
{
	public static void main(String[] args) 
	{
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53);
		Account account3 = new Account("Cho", 90.00);
		Account account4 = new Account("Lee", 100.00);
		Account account5 = new Account("Kim", 120.00);
		
		
		System.out.printf("%s balance: $%.2f%n",
				account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n",
				account2.getName(), account2.getBalance());
		

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter deposit amount for account1: ");
		double depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance%n%n",
				depositAmount);
		account1.deposit(depositAmount);
		
		
		System.out.printf("%s balance: $%.2f%n",
				account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n",
				account2.getName(), account2.getBalance());
		
		System.out.print("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account2 balance%n%n",
				depositAmount);
		account2.deposit(depositAmount);
		
		
		System.out.printf("%s balance: $%.2f%n",
				account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n",
				account2.getName(), account2.getBalance());
		
		
		System.out.println(account1.getName()+"'s account number : "+account1.getAccountNumber());
		System.out.println(account2.getName()+"'s account number : "+account2.getAccountNumber());
		System.out.println(account3.getName()+"'s account number : "+account3.getAccountNumber());
		System.out.println(account4.getName()+"'s account number : "+account4.getAccountNumber());
		System.out.println(account5.getName()+"'s account number : "+account5.getAccountNumber());
		
		
        input.close();
		
	}
    
}
