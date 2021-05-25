package model;

public class Factory {

	private static Factory instance;

	private Factory() {
	}

	public static Factory getInstance() {
		if (instance == null)
			instance = new Factory();

		return instance;
	}

	public Programa getArquivo(String tipo, String nome, String caminho, String data, String hora, String proprietario,
			String email, String autImpressao, String autCopia) {
		if (tipo.equals("texto")) {

			return new Texto(tipo, nome, caminho, data, hora, proprietario, email, autImpressao, autCopia);

		} else if (tipo.equals("apresentacao")) {

			return new Apresentacao(tipo, nome, caminho, data, hora, proprietario, email, autImpressao, autCopia);

		} else if (tipo.equals("planilha")) {

			return new Planilha(tipo, nome, caminho, data, hora, proprietario, email, autImpressao, autCopia);

		} else {
			return null;
		}
	}

}
