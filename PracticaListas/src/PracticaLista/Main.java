package PracticaLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> lista = new ArrayList<String>();

		lista.add(0, "Colombia");
		lista.add(1, "Chile");
		lista.add(2, "Argentina");
		lista.add(3, "Ecuador");
		lista.add(4, "Perú");
		lista.add(5, "Bolivia");
		lista.add(6, "Uruguay");
		lista.add(7, "Brasil");
		lista.add(8, "Paraguay");
		lista.add(9, "México");
		lista.add(10, "Guatemala");

		List<String> agregar = new ArrayList<String>();
		agregar.add("Costa Rica");
		lista.addAll(11, agregar);

		
		System.out.println("El 6to lugar es: " + lista.get(5));
		

		System.out.println("Figura Chile en la Lista?");
		if (lista.contains("Chile")) { System.out.println("Está en la Lista");} else {System.out.println("No está en la Lista");}

Iterator<String> listaIterable = lista.iterator();
		
		while(listaIterable.hasNext()) {
			System.out.println("Pais: " + listaIterable.next());
		}
		
		//lista.clear();
		System.out.println("Total de países: " + lista.size());
		
		/* --------------------------------------------------*/
		
	
	}

}
