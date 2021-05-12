package Model;

public class Masculino extends Genero {

	public Masculino(String nome, String tipogen) {
		super(nome, tipogen);
	}
	
	public String TipoGenero(String genero) {
		return "Bem vindo, Sr: " + getNome();	
		}
}
