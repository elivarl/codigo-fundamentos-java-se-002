package com.icodeap.arreglos_bidimensionales;

import java.util.ArrayList;
import java.util.List;

public class EjecutorPracticaArrregloB {
	
	public static void main(String[] args) {
		
		// crear un arreglo bidimensional 
		// inicializar con números positivos y negativos
		// buscar los números positivos y almacenarlos  en otro arreglo unidimensional
		byte [] numeroPositivos = new byte [50];
		
		byte [][] numeros = {
				{-1,0,5,10},
				{9,-8,-15,20},
				{-7,80,-25,30},
				{90,-80,-3,-75}				
		};
		
		int aux = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				if (numeros[i][j]>0) {
					numeroPositivos[aux] =  numeros[i][j];
					aux++;
				}
				
				System.out.print(numeros[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Números positivos");
		
		for (int i = 0; i < numeroPositivos.length; i++) {
			System.out.println(numeroPositivos[i] );
		}
		
		String nombre = "Elivar Largo";
		System.out.println("Mi nombre es: "+ nombre);
		
		byte numero1 = 10, numero2 = 20;
		System.out.println("El resultado es: "+ (numero1 +numero2));
				
	}

}
