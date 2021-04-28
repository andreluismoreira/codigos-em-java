package application;

import java.util.Scanner;

import entities.Account;
import exception.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter the account data: ");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			String holder = sc.next(); 
			System.out.print("Initial Balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, balance, withdrawLimit);
			System.out.println(" ");
			System.out.println(account);
			System.out.println(" ");
			System.out.print("Enter the amount for  withdraw: ");
			double amount = sc.nextDouble();
			account.withdraw(amount, withdrawLimit);
			System.out.println("New balance: " + account.getBalance());
		}
		catch (DomainException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
