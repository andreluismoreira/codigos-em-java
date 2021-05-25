package Model;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends SomadorExistente implements SomadorEsperado {

	public Adapter() {
	}

	// transforma os itens de vetor em lista
	@Override
	public int somaVetor(int[] vetor) {
		List<Integer> lista = new ArrayList<>();
		for (int in : vetor) {
			lista.add(in);
		}

		return somaLista(lista);

	}

}
