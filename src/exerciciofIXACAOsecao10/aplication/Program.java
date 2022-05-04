package exerciciofIXACAOsecao10.aplication;

import java.util.Scanner;

import exerciciofIXACAOsecao10.entities.Estudante;

import exerciciofIXACAOsecao10.entities.Quarto;

public class Program {

	public static void main(String[] args) {
		Estudante estudante;
		Quarto quarto;
		Scanner sc = new Scanner(System.in);
		Quarto[] quartos = new Quarto[10];
		System.out.print("How many rooms will be rented? ");
		int numEstudantes = sc.nextInt();
		sc.nextLine();
		for (int i = 0,rent=1; i < numEstudantes; i++, rent++) {
			System.out.println("Rent #"+rent+":");
			System.out.print("Name: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int quartoEscolhido = sc.nextInt();
			sc.nextLine();
			System.out.println();		
			quartos[quartoEscolhido] = new Quarto(new Estudante(nome,email,quartoEscolhido),true);
			
		System.out.println("Busy rooms: ");
		}for (int i = 0; i < quartos.length; i++) {
			if(quartos[i]!=null) {
				System.out.println(quartos[i]);
			}
			
		}

	}
}
