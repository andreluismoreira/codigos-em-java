package view;

import java.util.Scanner;

import model.Programa;
import model.Builder;
import model.Diretor;
import model.Factory;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Qual aplicativo deseja execultar [Texto|Apresentacao|Planilha]:");
		String tipo = sc.nextLine().toLowerCase();

		System.out.print("Nome do arquivo: ");
		String nome = sc.nextLine();
		System.out.print("Caminho do arquivo: ");
		String caminho = sc.nextLine();
		System.out.print("Data: ");
		String data = sc.nextLine();
		System.out.print("Hora: ");
		String hora = sc.nextLine();
		System.out.print("Proprietario: ");
		String proprietario = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Autorização para impressão? [Sim|Não]:  ");
		String autImpressao = sc.nextLine().toLowerCase();
		System.out.print("Autorização para copiar? [Sim|Não]:  ");
		String autCopia = sc.nextLine().toLowerCase();

		Diretor arquivoDiretor = new Diretor(new Builder());
		arquivoDiretor.buildArquivo(tipo, nome, caminho, data, hora, proprietario, email, autImpressao, autCopia);

		Factory arquivoFactory = arquivoDiretor.getArquivo();

	}

}
