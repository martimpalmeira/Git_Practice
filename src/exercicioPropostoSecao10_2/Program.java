package exercicioPropostoSecao10_2;

import java.util.Iterator;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] matriz = new int[n][m];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		//imprimirMatriz(matriz);
		int num = sc.nextInt();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == num) {
					System.out.println("Position "+i+","+j+":");
					if(j>0) {
						System.out.println("Left: "+ matriz[i][j-1]);
					}
					if(j<matriz[i].length-1) {
						System.out.println("Right: "+ matriz[i][j+1]);
					}
					if(i>0) {
						System.out.println("Up: "+ matriz[i-1][j]);
					}
					if(i<matriz.length) {
						System.out.println("Down: "+ matriz[i+1][j]);
					}
					
				}
			}
		}
		
	}

	public static void imprimirMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
}
