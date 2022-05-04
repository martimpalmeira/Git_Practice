package exercicioFixacaoSecao9.aplication;

import java.util.Locale;

import java.util.Scanner;

import exercicioFixacaoSecao9.entities.Account;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an account number: ");
		String accountNumber = sc.next();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String accountHolder = sc.nextLine();
		Account account1 = new Account(accountNumber, accountHolder);
		System.out.print("Is there an initial deposit (y/n)? ");
		char userAnswer = sc.next().charAt(0);
		double initialDeposit = 0;
		if (userAnswer == 'y') {
			System.out.print("Enter initial deposit value: ");
			initialDeposit = sc.nextDouble();
		
		}
		account1.initialDeposit(initialDeposit);
		System.out.print("\nEnter a deposit value: ");
		double depositValue = sc.nextDouble();
		account1.depositValue(depositValue);

		System.out.print("\nEnter a withdraw value: ");
		double withDrawValue = sc.nextDouble();
		account1.withDrawValue(withDrawValue);

		sc.close();
	}
}
