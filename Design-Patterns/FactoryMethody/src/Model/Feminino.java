package Model;

public class Feminino extends Genero {

	public Feminino(String nome, String tipogen) {
			super(nome,tipogen);
	}
	
	public String TipoGenero(String genero) {
		return "Bem vinda, Sra: " + getNome();
	}
}
