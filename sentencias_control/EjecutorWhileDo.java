package com.icodeap.sentencias_control;

public class EjecutorWhileDo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10;
		
		while(i>=0) {
			System.out.println("Ejemplo de bucle while: "+ i);	
			i-=2;
		}
		System.out.println("Valor final de i: "+i);
		
		int k=0;
		do {
			System.out.println("Ejemplo de bucle do while: "+ k);
			k++;
		}while(k<=10);
		
	}
	
	
}
