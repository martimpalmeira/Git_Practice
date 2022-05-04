package exercicioPropostoSecao10.aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicioPropostoSecao10.entities.Employee;

public class Program {

	public static void main(String[] args) {
		Employee employee;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("How many employees will be registered? ");
		int numEmployees = sc.nextInt();
		sc.nextLine();
		List<Employee> employees = new ArrayList<>();
		for (int i = 0, count = 1; i < numEmployees; i++, count++) {
			System.out.println("\nEmployee #" + count + ": ");
			System.out.print("Id: ");
			String id = sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			sc.nextLine();
			employees.add(new Employee(id, name, salary));
		}
		System.out.print("\nEnter the employee id that will have salary increase: ");
		String employeeId = sc.next();
		
		for (Employee employee2 : employees) {
			if(employee2.getId().equals(employeeId)) {
				employee2.increaseSalary(1000);
				break;
			}else {
				if(employee2 == employees.get(numEmployees-1)) {
					if(!employee2.getId().equals(employeeId))
					System.out.println("This id does not existe!");
				}
				
			}
		}
		
		System.out.println("\nList of employees:");
		for (Employee employee2 : employees) {
			System.out.println(employee2);
		}
		sc.close();
	}
	
	

}
