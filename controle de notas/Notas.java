package Entidade;

public class Notas {
    private Materia materia;
    private Double nota;

    @Override
    public String toString() {
        return "materia = " + materia.getNome() + ", nota = " + nota;
    }

    public Materia getMateria() {
        return materia;
    }
    public Double getNota() {
        return nota;
    }
    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    public void setNota(Double nota) {
        this.nota = nota;
    }

}
