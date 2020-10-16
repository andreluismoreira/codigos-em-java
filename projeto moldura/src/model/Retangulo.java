package model;

public class Retangulo {

		//Atributos
		private float base;
		private float altura;
		
		//Construtores
		public Retangulo (float base, float altura) {
			this.base = base;
			this.altura = altura;
		}
		
		public float getBase() {
			return base;
		}

		public void setBase(float base) {
			this.base = base;
		}

		public float getAltura() {
			return altura;
		}

		public void setAltura(float altura) {
			this.altura = altura;
		}

		//Metodos
		public float calcularArea() {
			return this.base * this.altura;

		}
	
		
}
