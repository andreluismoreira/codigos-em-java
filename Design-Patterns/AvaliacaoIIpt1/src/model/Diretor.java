package model;

public class Diretor {

	private Builder builder;

	public Diretor(Builder builder) {
		this.builder = builder;
	}

	public void buildArquivo(String tipo, String nome, String caminho, String data, String hora, String proprietario,
			String email, String autImpressao, String autCopia) {
		switch (tipo) {
		case "texto":
			builder.txtBuild(nome, caminho, data, hora, proprietario, email, autImpressao, autCopia);
			System.out.println("Arquivo [" + nome + ".txt] gerado com sucesso");
			if (autCopia.equals("sim")) {
				builder.txtBuild(nome + "Copia", caminho, data, hora, proprietario, email, autImpressao, autCopia);
				System.out.println("Arquivo [" + nome + "Copia.txt] gerado com sucesso");
			}
			break;
		case "apresentacao":
			builder.pptBuild(nome, caminho, data, hora, proprietario, email, autImpressao, autCopia);
			System.out.println("Arquivo [" + nome + ".ppt] gerado com sucesso");
			if (autCopia.equals("sim")) {
				builder.txtBuild(nome + "Copia", caminho, data, hora, proprietario, email, autImpressao, autCopia);
				System.out.println("Arquivo [" + nome + "Copia.ppt] gerado com sucesso");
			}
			break;
		case "planilha":
			builder.xlxsBuild(nome, caminho, data, hora, proprietario, email, autImpressao, autCopia);
			System.out.println("Arquivo [" + nome + ".xlxs] gerado com sucesso");
			if (autCopia.equals("sim")) {
				builder.txtBuild(nome + "Copia", caminho, data, hora, proprietario, email, autImpressao, autCopia);
				System.out.println("Arquivo [" + nome + "Copia.xlxs] gerado com sucesso");
			}
			break;
		default:
			System.out.println("aplicação inválida");
			break;
		}
	}

	public Factory getArquivo() {
		return builder.getArquivoFactory();
	}

}
