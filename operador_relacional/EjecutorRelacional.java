package com.icodeap.operador_relacional;

public class EjecutorRelacional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		byte b = 15;
		int d = 10;
		double c = 3.25;
		char a1 = 'A';
		char a2 = 'B';
		boolean c1 = true;
		boolean c2 = false;
		
		
		//== igual
		
		System.out.println("Resultado de a == b: "+ (a == b)); //false
		// != diferente
		System.out.println("Resultado de a != d: "+ (a != d)); //false
		// > mayor q
		System.out.println("Resultado de a > d: "+ (a > d)); //false
		
		// < menor q
		System.out.println("Resultado de b < a: "+ (b < a)); //false
		
		// <= menor o igual 
		System.out.println("Resultado de c <= b: "+ (c <= b)); //true
		
		
		// >= mayor o igual 
		System.out.println("Resultado de b >= d: "+ (b >= d)); //true
		
		// == igual 
		System.out.println("Resultado de variables char a1 < a2: "+ (a1 < a2)); //true
		
		// == igual 
		System.out.println("Resultado de variables bolean  c1 == c2: "+ (c1 != c2)); //true

	}

}
