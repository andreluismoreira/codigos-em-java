package View;

import java.util.Scanner;

public class Matriz {

	public static void main(String Args[]) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o numero de linhas: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o numero de colunas: ");
		int m =sc.nextInt();
		
		int [][] matriz = new int [n][m];
		
		
		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < m; j ++) {
				matriz[i][j]= sc.nextInt();	
			}
		}
		
		System.out.println("Escolha um numero presente na matriz: ");
		int x = sc.nextInt();
		
		int cont = 0;
		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < m; j ++) {
				if (matriz[i][j] == x) {
					cont ++;
				}
			}
		}
		System.out.println("O numero " + x + " apareceu: " + cont + " vezes");
		
		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < m; j ++) {
				if (matriz[i][j] == x) {
					System.out.println("Posição: " + "("+ i + "," + j +")");
					if (j > 0) {
						System.out.println("Left: " + matriz[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Esquerda: " + matriz[i-1][j]);
					}
					if (j < matriz[i].length-1) {
						System.out.println("Direita: " + matriz[i][j+1]);
					}
					if (i < matriz.length-1) {
						System.out.println("Abaixo: " + matriz[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}
}
