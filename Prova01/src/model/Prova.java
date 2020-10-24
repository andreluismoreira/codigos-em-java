package model;

import java.util.ArrayList;

public class Prova {

	//Atributos
	
	private int idProva;
	private Aluno aluno;
	private ArrayList <Integer> pesos;
	private ArrayList <Float> pontuacaoQuestoes;
	private ArrayList <String> respostaCerta;
	private ArrayList <String> perguntas;
	private ArrayList<ArrayList<String>> respostas;
	 
	//construtores
	
	public Prova () {}
	
	public Prova( int idprova, Aluno aluno, ArrayList<Integer> pesos, ArrayList<Float> pontuacaoQuestoes, 
			ArrayList<String> respostaCerta, ArrayList<String> perguntas, ArrayList<ArrayList<String>> respostas) {
		this.idProva = idprova;
		this.aluno = aluno;
		this.pesos = pesos;
		this.pontuacaoQuestoes = pontuacaoQuestoes;
		this.respostaCerta = respostaCerta;
		this.perguntas = perguntas;
		this.respostas = respostas;
		
	}
	
	// Get e set
	public int getIdProva () {
		return idProva;
	}
	
	public void getIdProva (int idProva) {
		this.idProva = idProva;
	}
	
	public Aluno getAluno () {
		return aluno;
	}
	
	public void setAluno (Aluno aluno) {
		this.aluno = aluno;
	}
	
	public ArrayList<Integer> getPesos() {
		return pesos;
	}

	public void setPesos(ArrayList<Integer> pesos) {
		this.pesos = pesos;
	}
	
	public ArrayList <Float> getPontuacaoQuestoes () {
		return pontuacaoQuestoes;
	}
	
	public void setPontuacaoQuestoes (ArrayList<Float> pontuacaoQuestoes) {
		this.pontuacaoQuestoes = pontuacaoQuestoes;
	}

	public ArrayList<String> getRespostaCerta () {
		return respostaCerta;
	}
	
	public void setRespostaCerta (ArrayList<String> respostaCerta) {
		this.respostaCerta = respostaCerta;
	}
	
	public ArrayList<String> getPerguntas () {
		return perguntas;
	}
	
	public void setPerguntas (ArrayList<String> perguntas) {
		this.perguntas = perguntas;
	}
	
	public ArrayList<ArrayList<String>> getRespostas() {
		return respostas;
	}

	public void setRespostas(ArrayList<ArrayList<String>> respostas) {
		this.respostas = respostas;
	}

	//to string
	public String toString() {
		return "Prova [idProva=" + idProva + ", aluno=" + aluno + ", pesos=" + pesos + ", pontuacaoQuestoes="
				+ pontuacaoQuestoes + ", respostaCerta=" + respostaCerta + ", perguntas=" + perguntas + ", respostas="
				+ respostas + "]";
	}

	//Metodos

	public float calcularNota() {
		float notaQuestao = 0, pesoQuestao = 0;
		for (int i = 0; i < perguntas.size(); i++) {
			notaQuestao += this.pesos.get(i) * this.pontuacaoQuestoes.get(i);
		}
		for (int j = 0; j < perguntas.size(); j++) {
			pesoQuestao += this.pesos.get(j);
		}
		return (float) notaQuestao / pesoQuestao;
	}

}
