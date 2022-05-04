package exercicioResolvidoSecao10;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] matriz = new int[n][n];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
			System.out.println();

		}
		imprimirMatriz(matriz);
		findMainDiagonal(matriz);
		System.out.println(findNegativeNumbers(matriz));
		sc.close();
	}

	public static void imprimirMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void findMainDiagonal(int[][] matriz) {
		System.out.println("Main diagonal:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == j) {
					System.out.print(matriz[i][j] + " ");
				}
			}

		}

	}

	public static int findNegativeNumbers(int[][] matriz) {
		System.out.print("\nNegative numbers: ");
		int cont = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0) {
					cont++;
				}
			}

		}return cont;

	}

}
