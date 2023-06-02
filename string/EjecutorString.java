package com.icodeap.string;

public class EjecutorString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String miCadena = "Hola String";
		String b1 = "";
		System.out.println("Esto es el valor de la variable miCadena: "+ miCadena);
		
		String cadena = new String("Esto es un ejemplo de una variable de tipo String");
		
		System.out.println(cadena);
		
		System.out.println();		
		int longitud = miCadena.length();
		System.out.println("La longitud de la variable miCadena es: "+ longitud);
		
		String c1 = miCadena.toUpperCase();
		System.out.println("miCadena en mayusculas: "+ c1);
		
		String c2 = miCadena.toLowerCase();
		System.out.println("miCadena en minusculas: "+ c2);
		
		boolean estado = b1.isEmpty();
		System.out.println("El valor de isEmpty() es: "+ estado);
		
		char miCaracter = miCadena.charAt(0);
		System.out.println("El caracter de la posicion 0: es "+miCaracter);
		
		boolean e1 = miCadena.contains("pa");
		System.out.println("La palabra pa está contenida en miCadena?: "+e1);

	}

}
