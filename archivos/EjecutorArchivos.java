package com.icodeap.archivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EjecutorArchivos {

	public static void main(String[] args) {
		// https://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html
		
		//ESCRITURA Y LECTURA DE ARCHIVOS EN JAVA
		
		//API NIO (JDK 7)
		// API IO (LEGACY)
		writeFile();
		readFile();
		
	}
	
	static void writeFile() {
		Path file = Path.of("D:\\icodeap\\cursos-icodeap\\Curso de Fundamentos de Java SE\\archivo.txt");
		String texto = "Esto es mi archivo.\nEsta es mi segunda linea";
		List<String> lines = List.of("Linea1 ejemplo", "Linea2 desde el metodo", "Linea3");
		
		try {
			Files.write(file, lines);
			System.out.println("Archivo creado con éxito.");
		}catch (IOException e) {
			System.out.println("Error al escribir en el archivo: "+e.getMessage());
		}
		
	}
	
	static void readFile() {

		Path fileRead = Path.of("D:\\icodeap\\cursos-icodeap\\Curso de Fundamentos de Java SE\\archivo.txt");
		
		try {
			List<String> linesRead = Files.readAllLines(fileRead);
			for(String line : linesRead) {
				System.out.println(line);
			}
		}catch(IOException e) {
			System.out.println("Error al leer el archivo: "+e.getMessage());
		}	
	}

}
