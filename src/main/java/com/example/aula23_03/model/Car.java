package com.example.aula23_03.model;

/**
 * Carro
 */
public class Car {
    private int id;
    private String placa;
    private String cor;
    private String modelo;
    private int ano;
    
    public Car(int id, String placa, String cor, String modelo, int ano) {
		this.id = id;
		this.placa = placa;
		this.cor = cor;
		this.modelo = modelo;
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	@Override
	public String toString() {
		return "Carro [ano=" + ano + ", cor=" + cor + ", id=" + id + ", modelo=" + modelo + ", placa=" + placa + "]";
	}
	
    

    
}