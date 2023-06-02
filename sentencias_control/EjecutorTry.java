package com.icodeap.sentencias_control;

public class EjecutorTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		try {
			int resultado = 10/0;
			System.out.println("El resultado es: "+resultado);
		}catch (Exception ex) {
			System.out.println("Error: No es posible dividir por cero");
		}
	}

}
