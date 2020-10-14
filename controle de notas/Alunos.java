package Entidade;

import java.util.ArrayList;

public class Alunos extends Pessoa{
    private Integer matricula;
    private ArrayList<Notas> notas;


    public Alunos(String nome, Integer matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new ArrayList<>();
    }
    public String toString() {
            return nome + " - " + matricula;
    }
    public ArrayList<Notas> getNotas() {
        return notas;
    }
    public void setNotas(ArrayList<Notas> notas) {
        this.notas = notas;
    }
    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
    public Integer getMatricula() {
        return matricula;
    }

}
