package Model;

public class TipoDeLivro extends Publicacao {

	private Integer id;
	private String titulo;
	private String tipo;
	private String isbn;

	public TipoDeLivro(int id, String tipo, String isbn, String titulo, Armazenamento armazenamento) {
		super(armazenamento);
		this.tipo = tipo;
		this.isbn = isbn;
		this.id = id;
		this.titulo = titulo;
	
	}

	public String armazenamento() {
		return armazenamento.armazenamento();	
	}

	@Override
	public String toString() {
		return "TipoDeLivro [id=" + id + ", titulo=" + titulo + ", tipo=" + tipo + ", isbn=" + isbn + ", armazenamento="
				+ armazenamento + "]";
	}
	
	
}
