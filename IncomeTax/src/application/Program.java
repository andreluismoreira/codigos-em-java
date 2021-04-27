package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.IncomeTax;
import entities.Individual;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<IncomeTax> income = new ArrayList<>();
		
		System.out.println("Enter the number of tax payers: ");
		int x = sc.nextInt();
		
		for(int i = 1; i <= x; i ++ ) {
			System.out.print("Individual or Company [i;c]: ");
			char type = sc.next().charAt(0);
			System.out.print("Enter the name: ");
			String name = sc.next();
			System.out.print("Enter the Annual income: ");
			double annualIncome = sc.nextDouble();
			
			if (type == 'i') {
				System.out.println("Enter the health care expenditures: ");
				double healthIncome = sc.nextDouble();
				
				Individual individual = new Individual(name, annualIncome, healthIncome);
				income.add(individual);
				
			} else if (type == 'c') {
				System.out.println("Enter the number os employees: ");
				int employee = sc.nextInt();
				
				Company company = new Company(name, annualIncome, employee);
				income.add(company);
			}
		}
		
		System.out.println("Taxes paid: ");
		for (IncomeTax incomeTax : income) {
			System.out.println(incomeTax);
		}
		
		
		
		
		
		sc.close();
	}

}
