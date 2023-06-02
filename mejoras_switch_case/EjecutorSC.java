package com.icodeap.mejoras_switch_case;

public class EjecutorSC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var dia = "Sabado";
		
		switch (dia) {
		case "Lunes" ->{ System.out.println("Dia de la semana");
		System.out.println("Una sentencias más");
		}
		case "Martes" -> System.out.println("Dia de la semana");
		case "Miercoles" -> System.out.println("Dia de la semana");
		case "Jueves" -> System.out.println("Dia de la semana");
		case "Viernes" -> System.out.println("Dia de la semana");
		case "Sabado" -> System.out.println("Dia de fin de semana");
		case "Domingo" -> System.out.println("Dia de fin de semana");
		default -> System.out.println("Dia desconocido");
		
		
		}
		
		//Multiples casos
		switch (dia) {
		case "Lunes", "Martes", "Miercoles", "Jueves", "Viernes" ->System.out.println("Dia de la semana (Multiples casos)");
		case "Sabado", "Domingo" -> System.out.println("Dia de fin de semana (Multiples casos)");
		default -> System.out.println("Dia desconocido (Multiples casos)");		
		
		}
		
		//switch con return
		var numeroDia = switch (dia) {
		case "Lunes" -> 1;
		case "Martes" -> 2;
		case "Miercoles" -> 3;
		case "Jueves" -> 4;
		case "Viernes" -> 5;
		case "Sabado" -> 6;
		case "Domingo" -> 7;
		default -> 0;			
		};
		
		System.out.println("El numero del día de la semana es: "+numeroDia);
		
	}

}
