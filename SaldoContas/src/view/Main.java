package view;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> idconta = new ArrayList<Integer> ();
		ArrayList<Double> saldo = new ArrayList<Double> ();
		Scanner entrada = new Scanner(System.in);
		int cont;
		
		// Entradasdousuario
		System.out.print("Digite quantas contas serão adicionadas: ");
		cont = entrada.nextInt();
		double maior = 0;
		int num = 0;
		for (int i = 0; i < cont; i ++) {
			System.out.print("Digite o numero da conta: ");
			idconta.add(entrada.nextInt());
			System.out.print("Digite o saldo da conta: ");
			saldo.add(entrada.nextDouble());
			 if (saldo.get(i) > maior) {
				 maior = saldo.get(i);
				 num = i;
			 }
			 
		}
			entrada.close();
			System.out.printf("O maior saldo e de: " + maior + " na conta de numero: " + idconta.get(num));
	}
}
