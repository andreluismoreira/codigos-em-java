package Model;

public class Genero {

	
	public String nome;
	public String genero;
	
	public Genero(String nome, String tipogen) {
		this.nome = nome;
		this.genero = tipogen;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String tipogen) {
		this.genero = tipogen;
	}
	
	public String TipoGenero(String genero) {
		return "Ola, " + this.nome;
	}
	
}
