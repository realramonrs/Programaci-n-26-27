package apiJava;

import java.util.Arrays;

public class Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Arrays : 
		//Declarar un array con capacidad para 4 enteros
		int[] x = new int[10]; //Por defecto todas las posiciones almacenan el valor 0
		x[0] = 0;
		x[1] = 8;
		x[2] = 4;
		x[3] = 6;
		//En este momento el array sería [8,4,0,0]
		
		//Mostrar todos los valores de un array por pantalla
		System.out.println(x[0] + " , " + x[1]+ " , " + x[2]+ " , " +x[3]);
		
		System.out.println(Arrays.toString(x));
		
		//Obtener el número de elementos de un array
		int numeroElementos = x.length;
		int ultimoIndice = x.length - 1;
		
		//Hacer una copia del array
		int[] copia = Arrays.copyOf(x, x.length);
		System.out.println("Array copia: \n" + Arrays.toString(copia));
		//Ordenar un array de menor a mayor
		System.out.println("Array ordenado");
		Arrays.sort(x);
		
		System.out.println(Arrays.toString(x));
		
		//Método búsqueda binarySearch
		
		int posicion = Arrays.binarySearch(x, 8);
		System.out.println("El 8 está en la posición: " + posicion);
		
		//Declarar e inicializar un array
		int[] a = {3,4,6,7,0,9,7,6,5};
		int[] b = a; //Ojo!!!
		int[] c = Arrays.copyOf(a, a.length);
		//b[0] = 0;
		c[0] = 9;
		System.out.println(a[0]);
		
		
		
		int[] original = {1,2,3,4,5};
		System.out.println(Arrays.toString(original));
		
		//***********Aumentar el array original en una posicion
		int[] originalPlus = new int [original.length + 1];
		originalPlus = Arrays.copyOf(original, originalPlus.length);
		
		original = originalPlus;
		//**************************************************//
		
		System.out.println(Arrays.toString(original));
		
		
		
		
		
		
		
		
		
	}

}
