package com.icodeap.objetos;

public class Auto {
	String color;
	int puertas;
	double velocidadMaxima;
	double velocidadActual;
	
	public Auto() {
		velocidadActual = 50;
	}
	
	public void encender() {
		System.out.println("Auto encendido!!!");
	}
	
	public void acelerar() {
		System.out.println("Auto acelerando!!!");
	}
	
	public void frenar() {
		System.out.println("Auto frenando!!!");
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return this.color;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public double getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(double velocidadActual) {
		this.velocidadActual = velocidadActual;
	}
	

}
