package application;

import java.util.Scanner;

import entities.Atendente;
import entities.Funcionario;
import entities.Pedido;

public class Client {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		Atendente atendente = new Atendente(new Funcionario());
		
		System.out.println("Qual opção de Sanduiche [Hamburguer,Chesseburguer]: ");
		String sanduiche = sc.nextLine();
		System.out.println("Qual o tamanho da Batata [P,M,G]: ");
		String batata = sc.nextLine();
		System.out.println("Qual opção de Brinquedo [Carrinho,Boneca]: ");
		String brinquedo = sc.nextLine();
		System.out.println("Qual opção de bedida [Coca,Guarana]: ");
		String refrigerante = sc.nextLine();
	
		
		atendente.montarPedido(sanduiche, batata, brinquedo, refrigerante);
		
		Pedido pedido = atendente.getPedido();
		System.out.println("-----------------------------------------------");
		System.out.println(pedido.toString());

	}

}
