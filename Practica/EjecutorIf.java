package com.icodeap.practica;

public class EjecutorIf {

	public static void main(String[] args) {
		//Estado calificaciones estudiante
		//0-4 Reprobado
		///5-6 En Espera
		//7-10 Aprobado
		
		byte calificacion = -5;
		
		
		if( calificacion >=0 && calificacion <= 4) {
			System.out.println("Estudiante Reprobado");
		}else if ( calificacion >=5 && calificacion <= 6) {
			System.out.println("Estudiante en Espera");			
		}else if ( calificacion >=7 && calificacion <= 10)   {
			System.out.println("Estudiante Aprobado");
		}else {
			System.out.println("Calificación no valida");
		}
		
	/*	if( calificacion >=0 && calificacion <= 4) {
			System.out.println("Estudiante Reprobado");
		}
		if( calificacion >=5 && calificacion <= 6) {
			System.out.println("Estudiante en Espera");
		}
		if( calificacion >=7 && calificacion <= 10) {
			System.out.println("Estudiante Aprobado");
		}*/
		
		
	}

}
