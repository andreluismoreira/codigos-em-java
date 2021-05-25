package Model;

public class Cliente {

	SomadorEsperado somador = new Adapter();

	public Cliente(SomadorEsperado somador) {
		this.somador = somador;

	}

	// Chama o adapter que transforma o vetor em lista e faz a soma
	public void executar() {
		int[] vetor = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int soma = somador.somaVetor(vetor);
		System.out.println("resultado: " + soma);

	}
}
