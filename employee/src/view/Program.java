package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Employee;

public class Program {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("How many employee do you want to register ?");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i ++) {
			System.out.println("Employee number " + (i+1));
			System.out.println("Employee ID: ");
			Integer id = sc.nextInt();
			System.out.println("Employee Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Employee salary: ");
			double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			list.add(emp);
		}
		
		System.out.println("Enter the employee id that will have salary increased: ");
		Integer id = sc.nextInt();
		Integer pos = position (list, id);
		
			if(pos == null) {
				System.out.println("The is doesnt exist !");
			} else {
				System.out.println("what percentagem will increased: ");
				double percentage = sc.nextDouble();
				list.get(pos).increaseSalary(percentage);
				System.out.println(list);
			}
			
		sc.close();
	}
	public static Integer position(List<Employee> list, int id) {
		for(int i = 0; i < list.size(); i ++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
		
	}

}
