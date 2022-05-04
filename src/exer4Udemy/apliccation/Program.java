package exer4Udemy.apliccation;

import java.util.Locale;

import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o valor do dolar?");
		double dolarValue = sc.nextDouble();
		System.out.println("Quantos dólares quer comprar?");
		double dolarAmount = sc.nextDouble();
		System.out.println(CurrencyConverter.calculateReaisAmount(dolarValue, dolarAmount));
		sc.close();
	}

}
