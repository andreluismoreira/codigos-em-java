package model;

public class Builder {

	private Factory arquivoFactory;

	public Builder() {
		this.arquivoFactory = Factory.getInstance();
	}

	public void txtBuild(String nome, String caminho, String data, String hora, String proprietario, String email,
			String autImpressao, String autCopia) {
		this.arquivoFactory.getArquivo("Texto", nome, caminho, data, hora, proprietario, email, autImpressao, autCopia);
	}

	public void pptBuild(String nome, String caminho, String data, String hora, String proprietario, String email,
			String autImpressao, String autCopia) {
		this.arquivoFactory.getArquivo("Apresentação", nome, caminho, data, hora, proprietario, email, autImpressao,
				autCopia);
	}

	public void xlxsBuild(String nome, String caminho, String data, String hora, String proprietario, String email,
			String autImpressao, String autCopia) {
		this.arquivoFactory.getArquivo("Planilha", nome, caminho, data, hora, proprietario, email, autImpressao,
				autCopia);
	}

	public Factory getArquivoFactory() {
		return arquivoFactory;
	}
}
