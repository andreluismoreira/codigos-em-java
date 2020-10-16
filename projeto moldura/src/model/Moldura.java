package model;

public class Moldura {

	//Atributos
	
	private Retangulo retanguloMaior;
	private Retangulo retanguloMenor;
	private float espessura;
	
	// construtor
	
	public Moldura (Retangulo retanguloMaior, float espessura) {
		this.espessura = espessura;
		this.retanguloMaior = retanguloMaior;
		this.retanguloMenor = new Retangulo(retanguloMaior.getBase()-(2*espessura), 
				retanguloMaior.getAltura()-(2*espessura));
	}

	//get e set
	public float getEspessura() {
		return espessura;
	}

	public void setEspessura(float espessura) {
		this.espessura = espessura;
	}

	public Retangulo getRetanguloMaior() {
		return retanguloMaior;
	}

	public void setRetanguloMaior(Retangulo retanguloMaior) {
		this.retanguloMaior = retanguloMaior;
	}

	public Retangulo getRetanguloMenor() {
		return retanguloMenor;
	}

	public void setRetanguloMenor(Retangulo retanguloMenor) {
		this.retanguloMenor = retanguloMenor;
	}
		
	//Metodos
	public float areaMoldura() {
		return this.retanguloMaior.calcularArea() - this.retanguloMenor.calcularArea();
	}
}


