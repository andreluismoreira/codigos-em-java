package Entidade;

public class Materia {
    private String nome;
    private Professor professor;

    @Override
    public String toString() {
        return nome + " professor = " + professor;
    }

    public String getNome() {
        return nome;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

}
