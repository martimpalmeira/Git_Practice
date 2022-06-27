package exercSecao13.exerc1.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import exercSecao13.exerc1.entities.Department;
import exercSecao13.exerc1.entities.HourContract;
import exercSecao13.exerc1.entities.Worker;
import exercSecao13.exerc1.entities.WorkerLevel;

public class Aplication {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		

		System.out.print("Enter department's name: ");
		Department department = new Department(sc.nextLine());

		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Level: ");
		String level = sc.nextLine();
		WorkerLevel workerLevel = WorkerLevel.valueOf(level);

		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		sc.nextLine();
		
		Worker worker = new Worker(name, workerLevel, baseSalary, department);

		System.out.print("How many contracts to this worker? ");
		Double numberOfContracts = sc.nextDouble();
		sc.nextLine();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("DD/MM/YYYY");
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM/YYYY");

		for (int i = 1; i <= numberOfContracts; i++) {
			System.out.println("Enter contract #" + i + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			String contractDateString = sc.nextLine();
			Date contractDate = sdf1.parse(contractDateString);
			
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			sc.nextLine();
			
			System.out.print("Duration (hours): ");
			Integer hours = sc.nextInt();
			sc.nextLine();
			
			
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
			
		}
		
		System.out.println();
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthYearString = sc.nextLine();
		Date monthYear =  sdf2.parse(monthYearString);
		
		System.out.println("Name: "+worker.getName());
		System.out.println("Department: "+worker.getDepartment().getName());
		Double income = worker.income(monthYear.getMonth(), monthYear.getYear());
		System.out.println("Income for " + monthYear + ": "+income);

		sc.close();
	}
	
	 
}
