package Model;

public class FactoryGenero extends FactoryMethod {

	
	public FactoryGenero() {}
	
	public Genero getGenero(String nome, String genero) {
		
		if (genero.equals("F")) {
				return new Feminino(nome, genero );
		}else if (genero.equals("M")) {
				return new Masculino(nome, genero);
		}else if (genero.equals("Indefinido")){
				return new Genero(nome, genero);
		}else {
				return null;
		}
	}

}


