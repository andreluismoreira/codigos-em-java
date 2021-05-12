package Model;

public abstract class Publicacao {

	protected Armazenamento armazenamento;

	protected Publicacao( Armazenamento armazenamento) {
		this.armazenamento = armazenamento;
	}

	public abstract String armazenamento();
}
