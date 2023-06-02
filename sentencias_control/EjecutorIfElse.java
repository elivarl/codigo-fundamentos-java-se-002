package com.icodeap.sentencias_control;

public class EjecutorIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(true) {
			System.out.println("if simple");
		}
		int numero = 10;
		
		if (numero >0) {
			System.out.println("Es un numero positivo");
		}else {
			System.out.println("Es un numero negativo");
		}
		boolean valor = (numero > 0) ? true:false;
		if (valor) {
			System.out.println("El numero usando el operador ternario es positivo");
		}
	}

}
