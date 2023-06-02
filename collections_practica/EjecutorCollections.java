package com.icodeap.collections_practica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjecutorCollections {

	public static void main(String[] args) {
		// Ejemplo practico de ArrayList
		
		//Declarar en inicializar
		
		//1. usando la clase que implementa
		ArrayList<String> miLista = new ArrayList<>();
   

        //2. Usando polimorfismo
		List lista0 = new ArrayList<>();
		List lista1 = new ArrayList<>(25);
       

        //3. usando el tipo de dato var		
		var list2 = new ArrayList<>();
		
		
		//añadir elementos
		miLista.add("Ecuador");
		miLista.add("Colombia");
		miLista.add(2, "Peru");
		
		//actualizar elementos
		miLista.set(0, "Chile");
		System.out.println(miLista);
		
		//obtener
		System.out.println(miLista.get(0));
		
		//tamaño
		System.out.println("el tamaño de miLista es: "+miLista.size());
		
		//eliminar
		miLista.remove(1);
		System.out.println(miLista);
		System.out.println();
		
		//inicializar con datos
		var listaNueva = Arrays.asList(5, 8, 10);
								
		System.out.println(listaNueva);
		
		System.out.println("recorrer la lista usando foreach");
		//recorrer la lista usando foreach
		miLista.forEach(
				s -> System.out.println(s)
				);
		
	}

}
