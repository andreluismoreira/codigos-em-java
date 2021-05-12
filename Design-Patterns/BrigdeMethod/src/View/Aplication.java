package View;

import Model.DataBase;
import Model.Publicacao;
import Model.TipoDeLivro;

public class Aplication {

	public static void main(String[] args) {

		Publicacao livro = new TipoDeLivro(1, "livro", "isbn", "harry poter", new DataBase());
		
		System.out.println(livro.toString());
	}

}
