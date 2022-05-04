package exer1Udemy;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo r1 = new Retangulo();
		System.out.println("Enter rectangle width and heigth: ");
		r1.setHeigth(sc.nextDouble());
		r1.setWidth(sc.nextDouble());
		System.out.printf("Area = %.2f%n" , r1.calculateArea());
		System.out.printf("Perimeter = %.2f%n" , r1.calculatePerimeter());
		System.out.printf("Diagonal = %.2f%n" , r1.calculateDiagonal());
		sc.close();
	}

}
