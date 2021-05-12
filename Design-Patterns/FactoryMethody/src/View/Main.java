package View;

import java.util.Scanner;

import Model.FactoryGenero;
import Model.Genero;

public class Main {

	public static void main(String[] args) {
		
		String nome = "";
		String genero = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ola qual o seu nome ?");
		nome = sc.nextLine();
		System.out.println("Qual o seu genero [M/F] ou Indefinido ?");
		genero = sc.nextLine();
		
		FactoryGenero factorygenero = new FactoryGenero();
		Genero generos = factorygenero.getGenero(nome, genero);
		
		
		System.out.println(generos.TipoGenero(genero));
		

		sc.close();
	}
}


