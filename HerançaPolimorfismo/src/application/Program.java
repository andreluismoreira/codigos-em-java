package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String Args[]) {
		
		Scanner sc = new Scanner (System.in);
		
		List<Employee> employeeList = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int x = sc.nextInt();
		
		for(int i = 1; i <= x; i ++ ) {
			System.out.println("Employee number #" + i);
			System.out.print("The employee is a Outsourced ? [y,n] ");
			char out = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if (out == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				employeeList.add(emp);
			} else {
				Employee emp = new Employee(name, hours, valuePerHour);
				employeeList.add(emp);
			}
			
		}
		
		System.out.println("Payment: ");
		for (Employee employee : employeeList) {
			System.out.println(employee.getName() + " - $:" + String.format("%.2f", employee.payment()));
		}
		
		sc.close();
	}
}
