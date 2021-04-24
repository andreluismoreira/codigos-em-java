package Aplication;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Entities.Department;
import Entities.HourContract;
import Entities.Worker;
import Entities.Enum.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	
		System.out.println("Enter the department's name: ");
		String departmentName =sc.nextLine();
		System.out.println("Enter Worker data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base Salary: ");
		double  baseSalary = sc.nextDouble();
		Worker worker = new Worker(name, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.println("How many contracts " + name + " works: ");
		int x = sc.nextInt();
		
			for (int i = 0; i < x; i ++) {
				System.out.println("Enter the contract date #" + i + " data: ");
				System.out.print("Data [dd/mm/yyyy]: ");
				Date contractDate = sdf.parse(sc.next());
				System.out.print("Base Salary: ");
				double valuePerHour = sc.nextDouble();
				System.out.print("Worked hours: ");
				int hour = sc.nextInt();
				HourContract contract = new HourContract(contractDate, valuePerHour, hour);
				worker.addContract(contract);
				
			}
		System.out.println("#*#*#*#*#*#*#*#*#*#*#*#* RECIPE #*#*#*#*#*#*#*#*#*#*#*#*#*#*");
		System.out.print("Enter the month and year to calculated the income [MM/yyyy]: ");
		String MonthandYear = sc.next();
		int month = Integer.parseInt(MonthandYear.substring(0,2));
		int year = Integer.parseInt(MonthandYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Salary for period: "+ MonthandYear +" "+ String.format("%.2f",worker.income(year, month))+ " $$");
		System.out.println("#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*");
		sc.close();
	}

}
