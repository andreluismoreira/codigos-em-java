package view;
import model.Prova;
import model.Aluno;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int idProva, matricula, numQuestoes;
		String nome, curso;
		Aluno aluno;
		Prova prova = null;
		ArrayList <Integer> pesos = new ArrayList<>();
		ArrayList <Float> pontuacaoQuestoes = new ArrayList<>();
		ArrayList <String> respostaCerta = new ArrayList<>();
		ArrayList <String> perguntas = new ArrayList<>();
		ArrayList <ArrayList<String>> respostas = new ArrayList<ArrayList<String>>();
		ArrayList <String> respostaDoAluno = new ArrayList<String>();
		
		//cadastro do aluno
		System.out.println("### Area do Aluno ###");
		System.out.print("Digite o seu Nome: ");
		nome = scanner.nextLine();
		System.out.print("Ola, digite sua Matricula: ");
		matricula = scanner.nextInt();
		System.out.print("Ola, digite seu Curso: ");
		scanner.nextLine();
		curso = scanner.nextLine();
		aluno = new Aluno(nome, matricula, curso);
		
		// cadastro da prova
		System.out.println("### Cadastro de Provas ###");
		System.out.print("Digite o Id da prova: ");
		idProva = scanner.nextInt();
		System.out.print("Digite a Quantidade de Questoes: ");
		numQuestoes = scanner.nextInt();
		
		// cadastro de questao pelo professor
		for (int i = 0; i < numQuestoes; i++) {
			perguntas.add("questao " + (i + 1));
			System.out.print("Digite o peso para a questao " + (i + 1) + ": ");
			pesos.add(scanner.nextInt());
			System.out.print("Digite uma alternativa correta para a questao :" + (i + 1) + " [A,B,C,D,E]: ");
			scanner.nextLine();
			respostaCerta.add(scanner.nextLine());
		}
		
		// resposta do aluno
		System.out.println("### Resposta do aluno ###");
		for (int i = 0; i < numQuestoes; i ++) {
			System.out.print("Questao " + (i + 1) + " digite como resposta uma das alternativas [A,B,C,D,E]: ");
			respostaDoAluno.add(scanner.nextLine());
		}
		
		prova = new Prova(idProva, aluno, pesos, pontuacaoQuestoes, respostaCerta, perguntas, respostas);
		
		for(int i = 0; i < numQuestoes; i ++) {
			if (prova.getRespostaCerta().get(i).equals(respostaDoAluno.get(i))) {
				pontuacaoQuestoes.add(10f);
			} else {
				pontuacaoQuestoes.add(0f);
			}
		}
		System.out.printf(" Resumo da prova " + prova.getIdProva() + ", curso: " + curso + "\n");
		
		System.out.printf("A nota do aluno: " + aluno.getNome() +
				" matricula: " + aluno.getMatricula() + " é: %.2f ", prova.calcularNota());
		
	}

}
