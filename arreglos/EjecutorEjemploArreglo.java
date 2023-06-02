package com.icodeap.arreglos;

public class EjecutorEjemploArreglo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] notas = new int [10];
		notas[0] = 10;
		notas[1] = 5;
		notas[2] = 8;
		notas[3] = 7;
		notas[4] = 6;
		notas[5] = 2;
		notas[6] = 3;
		notas[7] = 7;
		notas[8] = 8;
		notas[9] = 2;	
		
		int sumaNotas = 0;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
			sumaNotas += notas[i];
		}
		
		System.out.println("La suma de las notas es: "+ sumaNotas);
		
	}

}
