package model;

public class Conta {

	//Atributos
	private int numeros;
	private double saldo;
	
	//Construtores

	public Conta (int numeros, double saldo) {
		this.numeros = numeros;
		this.saldo = saldo;
	}
	
	public int getNumeros () {
		return numeros;
	}
	
	public void setNumeros () {
		this.numeros = numeros;
	}
	
	public double getSaldo () {
		return saldo;
	}
	
	public void setSaldo () {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "Conta [numeros=" + numeros + ", saldo=" + saldo + "]";
	}

	
	
}
