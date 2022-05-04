package exer3Udemy.aplication;

import java.util.Locale;

import java.util.Scanner;

import exer3Udemy.entities.Student;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student1 = new Student();
		System.out.print("");
		student1.setName(sc.nextLine());
		System.out.print("");
		student1.setTestGrade1(sc.nextDouble());
		System.out.print("");
		student1.setTestGrade2(sc.nextDouble());
		System.out.print("");
		student1.setTestGrade3(sc.nextDouble());
		sc.close();
		System.out.println("FINAL GRADE = " + student1.calculateFinalGrade());
		if (student1.didPass()) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.println("MISSING " + student1.missingPoints() + " POINTS");
		}
	}

}
