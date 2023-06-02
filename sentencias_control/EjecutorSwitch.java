package com.icodeap.sentencias_control;

public class EjecutorSwitch {

	public static void main(String[] args) {
		// Ejemplo
		// 1 = Lunes, 2= Martes, etc....
		
		byte numeroDia = 10;
		
		switch (numeroDia) {
		case 1: System.out.println("Lunes");
		break;
		case 2: System.out.println("Martes");
		break;
		case 3: System.out.println("Miercoles");
		break;
		case 4: System.out.println("Jueves");
		break;
		case 5: System.out.println("Viernes");
		break;
		case 6: System.out.println("Sabado");
		break;
		case 7: System.out.println("Domingo");
		break;
		default:
			System.out.println("El numero de dia no corresponde a ningun dia de la semana");
		
		}
		
		char vocal = 'z';
		switch(vocal) {
		case 'a': System.out.println("Es la letra a");
		break;
		
		case 'b': System.out.println("Es la letra b");
		break;
		
		default:
			System.out.println("La letra no coincide");
		
		
		
		}

	}

}
