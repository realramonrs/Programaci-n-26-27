package colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Listas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//LISTAS -> ARRAYLIST
		ArrayList<String> alumnos = new ArrayList<String>();
		ArrayList<String> alumnosDAW = new ArrayList<String>(3);
		ArrayList<String> alumnosDAM = new ArrayList<String>(3);
		
		//Añadir elementos a una lista
		alumnosDAW.add("Alvarez Julian");
		alumnosDAW.add("Gonzlález Erea");
		alumnosDAW.add("Martinez Pablo");
		alumnosDAW.add("Sueiro Pablo");
		
		alumnosDAM.add("Martinez Maria");
		alumnosDAM.add("Flores Joel");
		
		//Añadir una lista entera a otra lista
		alumnos.addAll(alumnosDAM);
		alumnos.addAll(alumnosDAW);
		
		//Otras formas de insertar elementos.
		alumnosDAW.add(1, "Nogueira Susana");
		alumnosDAW.addFirst("Primer Alumno");
		alumnosDAW.addLast("Ultimo Alumno");
		
		//Recuperar un elemento de una lista
		String alumno = alumnosDAW.get(0);
		boolean encontrado = alumnosDAW.contains("Nogueira Susana");
		
		//Obtener el número de elementos de una lista:
		int numero = alumnosDAW.size();
		//Como se recorre una lista
		
		for(int i = 0;i<alumnosDAW.size();i++) {
			System.out.println(alumnosDAW.get(i));
		}
		
		for(String a : alumnosDAW) {
			System.out.println(a);
		}
		
		
		//Eliminar objetos
		
		alumnosDAW.remove(0);
		alumnosDAW.remove("Ultimo Alumno");
		System.out.println();
		for(String a : alumnosDAW) {
			System.out.println(a);
		}
		
		//Eliminar al alumno que escoja el usuario
		
		System.out.println("Indica el nombre del alumno que quiere elimiar: ");
		
		String alumnoEliminar = new Scanner(System.in).nextLine();
		
		for(String a : alumnosDAW) {
			if(a.equals(alumnoEliminar)) {
				alumnosDAW.remove(a);
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
