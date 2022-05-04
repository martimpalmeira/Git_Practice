package exer2Udemy;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee1 = new Employee();
		System.out.print("Name: ");
		employee1.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employee1.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee1.tax = sc.nextDouble();
		System.out.println("\nEmployee " + employee1);
		System.out.print("\nWhich percentage to increase salary? ");
		double n = sc.nextDouble();
		employee1.increaseSalary(n);
		System.out.println("Updated data " + employee1);

		sc.close();
	}

}
