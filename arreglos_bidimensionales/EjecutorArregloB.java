package com.icodeap.arreglos_bidimensionales;

public class EjecutorArregloB {

	public static void main(String[] args) {
		
		String [][] miArreglo = new String [3][4];
		//fila 0
		miArreglo[0][0]= "A";
		miArreglo[0][1]= "B";
		miArreglo[0][2]= "C";
		miArreglo[0][3]= "D";
		
		//fila 1
		miArreglo[1][0]= "E";
		miArreglo[1][1]= "F";
		miArreglo[1][2]= "G";
		miArreglo[1][3]= "H";
		
		//fila 2
		miArreglo[2][0]= "I";
		miArreglo[2][1]= "J";
		miArreglo[2][2]= "K";
		miArreglo[2][3]= "L";
		
		System.out.println(miArreglo[0][2]);
		
		System.out.println();
		
		for (int i = 0; i < miArreglo.length; i++) {
			for (int j = 0; j < miArreglo[i].length; j++) {
				System.out.print(miArreglo[i][j]+ " ");
			}
			System.out.println();
			
		}		
	}
}
