package view;
import model.Retangulo;
import model.Moldura;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite a base: ");
		float b = scanner.nextFloat();
		System.out.print("Digite a altura: ");
		float h = scanner.nextFloat();
		System.out.print("Digite a espessura: ");
		float espessura = scanner.nextFloat();
		
		Retangulo retanguloMaior = new Retangulo(b, h);
		
		Moldura moldura = new Moldura(retanguloMaior, espessura);
		
		System.out.println("A area da moldura e: " + moldura.areaMoldura());
		
		scanner.close();
	}

}


