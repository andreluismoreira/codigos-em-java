package Model;

public class XML implements Armazenamento {

	public XML () {
		
	}
	
	@Override
	public String armazenamento() {
		return "este livro esta em XML";
	}

	@Override
	public String toString() {
		return armazenamento();
	}
	
	
}
