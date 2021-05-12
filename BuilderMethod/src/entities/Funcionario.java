package entities;

public class Funcionario {

	private Pedido pedido;
	
	public Funcionario() {
		pedido = new Pedido();
	}
	
	public void buildSanduiche(String sanduiche) {
		pedido.adicionarDentroDaCaixa(sanduiche);
	}

	public void buildBatata(String batata) {
		pedido.adicionarDentroDaCaixa(batata);
	}

	public void buildBrinquedo(String brinquedo) {
		pedido.adicionarDentroDaCaixa(brinquedo);
	}

	public void buildRefrigerante(String refrigerante) {
		pedido.adicionarForaDaCaixa(refrigerante);
	}
	
	public Pedido getPedido() {
		return pedido;
	}
}
