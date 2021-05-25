package model;

public class Programa {

	private String tipo;
	private String nome;
	private String caminho;
	private String data;
	private String hora;
	private String proprietario;
	private String email;
	private String autImpressao;
	private String autCopia;

	public Programa() {
	};

	public Programa(String tipo, String nome, String caminho, String data, String hora, String proprietario,
			String email, String autImpressao, String autCopia) {
		this.tipo = tipo;
		this.nome = nome;
		this.caminho = caminho;
		this.data = data;
		this.hora = hora;
		this.proprietario = proprietario;
		this.email = email;
		this.autImpressao = autImpressao;
		this.autCopia = autCopia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCaminho() {
		return caminho;
	}

	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAutImpressao() {
		return autImpressao;
	}

	public void setAutImpressao(String autImpressao) {
		this.autImpressao = autImpressao;
	}

	public String getAutCopia() {
		return autCopia;
	}

	public void setAutCopia(String autCopia) {
		this.autCopia = autCopia;
	}

}
