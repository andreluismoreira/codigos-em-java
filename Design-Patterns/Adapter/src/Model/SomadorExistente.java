package Model;

import java.util.List;

public class SomadorExistente {

	// Faz a soma dos itens adicionados a lista
	public int somaLista(List<Integer> lista) {
		int resultado = 0;
		for (int i : lista)
			resultado += i;
		return resultado;
	}
}
