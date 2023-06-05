package com.icodeap.objetos;

public class EjecutorObjetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto = new Auto();
		
		auto.setColor("Verde");
		auto.setPuertas(3);
		auto.setVelocidadMaxima(150);
		
		
		System.out.println(auto.getColor());
		System.out.println(auto.getVelocidadActual());

	}

}
