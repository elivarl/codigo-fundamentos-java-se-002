package com.icodeap.operadores_aritmeticos;

public class EjecutorOperadoresArtimeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3, total;
		//operacion suma
		num1 = 500;
		num2 = 250;
		num3 = 78;
		total = num1 + num2 + num3;
		System.out.println("La suma es: "+ total);
		
		//operacion resta
		
		total = total - 500;
		
		System.out.println("La resta es: "+ total);
		
		// multiplicación
		total = num1 * num2;
		
		System.out.println("La multiplicación es: "+ total);
		
		// division
		double totalD = 9.0 / 2;
		System.out.println("La división es: "+ totalD);
		
		//incremento
		++num1;
		System.out.println("uso de operador incremento: "+ num1);
		
		
		//decremento
		--num2;
		System.out.println("uso de operador decremento: "+ num2);
		
		//modulo
		
		int modulo = 10 % 3;
		System.out.println("Operador módulo: "+ modulo);

	}

}
