package com.icodeap.practica;

public class EjecutorSC {

	public static void main(String[] args) {
		// Ejemplo calculadora
		// ingresar 2 números
		// Manejar operaciones de suma, resta, multiplicación y división
		
		int numero1 = 15;
		int numero2 = 30;
		int resultado = 0;
		
		char opcion = '/';
		
		switch (opcion) {
		case '+': resultado = numero1 + numero2;
		System.out.println("El resultado de la suma es: "+ resultado);
		break;
		
		case '-': resultado = numero2 - numero1;
		System.out.println("El resultado de la resta es: "+ resultado);
		break;
		
		
		case '*': resultado = numero1 * numero2;
		System.out.println("El resultado de la multiplicación es: "+ resultado);
		break;
		
		
		case '/': resultado = numero2 / numero1;
		System.out.println("El resultado de la división es: "+ resultado);
		break;
		
		default: System.out.println("Operación no válida");
		
		
		}

	}
	 

}
