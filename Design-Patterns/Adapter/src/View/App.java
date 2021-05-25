package View;

import Model.Adapter;
import Model.Cliente;
import Model.SomadorEsperado;

public class App {

	public static void main(String[] args) {

		SomadorEsperado somador = new Adapter();
		
		Cliente cliente = new Cliente(somador);
		
		cliente.executar();

	}

}
