package Model;

public class DataBase implements Armazenamento{
	
	public DataBase() {
		
	}
	
	@Override
	public String armazenamento() {
		return "este livro esta armazenado no BD";
	}

	@Override
	public String toString() {
		return armazenamento();
	}
	
	
}
