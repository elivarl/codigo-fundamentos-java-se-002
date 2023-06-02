package com.icodeap.operadores_logicos;

public class EjecutoroperadorLogico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean operando1 = true;
		boolean operando2 = false;
		int num1 = 10, num2 = 15;
		//and
		System.out.println("El resultado del operador and es: "+ (operando1 && (num1 > num2)));
		
		// or
		System.out.println("El resultado del operador or es: "+ (operando1 || (10 > 7)));
		
		// not
		System.out.println("El resultado del operador not es: "+ (!false));
		
		//multiples
		System.out.println("uso de multiples operadores : "+ (!false && (4>5) ));

	}

}
