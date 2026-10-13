package soluciones;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		 Crear un programa en Java que utilice un array de tipo double de 
		 10 posiciones y realice secuencialmente las siguientes operaciones: 
		 
		 */
		
				
		double[] matriz = new double[10];
		
		// Apartado A:
		System.out.println("Apartado A: \n");
		/*
		 Asigna a la primera posición del array un número aleatorio 
		 entero entre 2 y 10 (ambos incluidos). 
		
		 */
		
		
		//Creo la variable aletarorio de tipo Random
		Random aleatorio = new Random();
		
		//Asigno a la primera posicion un entero entre el 2 y 10
		matriz[0] = aleatorio.nextInt(2,11);
		
		/*Asigna a la segunda posición del array el valor: 
		Un número aleatorio entero entre 15 y 30 (ambos incluidos).
		*/
		matriz[1] = aleatorio.nextInt(15,31);
		
		System.out.println("matriz[0]: "+matriz[0]+"\nmatriz[1]: "+matriz[1]);
		
		
		// Apartado B:
		System.out.println("\nApartado B: \n");
		/*Asigna a la tercera posición del array el valor:
		posicion[3] = sin(posicion[0] ) * cos(posicion [1] )  + log(posicion[2] + 1)
		 */
		
		matriz[2] = Math.round( Math.sin(matriz[0] ) * Math.cos(matriz [0] )+ Math.log(matriz[1] + 1)*10.0)/10.0;

		//Math.round(numero*10.0)/10.0 redondea a una cifra decimal, 
		//si quisiéramos redondear a dos sería Math.round(numero*100.0)/100.0
		
		System.out.println("Posicion 2: "+matriz[2]);
		
		
		// Apartado C:
		System.out.println("\nApartado C: \n");
		/*Asigna a la cuarta posición del array el valor:  
		La media aritmética de las 4 posiciones anteriores, 
		redondeada al entero más cercano. 
		 */
		
		double suma = (matriz[0] + matriz[1]+ matriz[2]+ matriz[3])/4;
		
		matriz[3] = Math.round(suma);
		
		System.out.println("Posicion 3: "+matriz[3]);
		
		
		// Apartado D:
		System.out.println("\nApartado D: ");
		/*Realizar una copia exacta de las primeras 5 posiciones en un segundo array
		 *de tamaño 5
		 */
		
		//Creo un array
		double[] matriz2 = new double[5];
		
		//Hago la copia mediante una funcion del array llamada copyof
		
		matriz2 = Arrays.copyOf(matriz, 5);
		
		System.out.println("Array copia 5 primeras posiciones: ");
		System.out.println(Arrays.toString(matriz2));
		
		
		
		
		// Apartado E:
		System.out.println("\nApartado E: ");
		/*Ordenar el segundo array de menor a mayor.
		 */
		
		//Ordeno el array
		Arrays.sort(matriz2);
		//Enseño por pantalla el array ordenado
		System.out.println("\n"+Arrays.toString(matriz2));
		
		
		// Apartado F:
		System.out.println("\nApartado F: ");
		/*Buscar en qué índice ha quedado el valor original generado en el apartado
		 a) dentro del array ordenado (usando Arrays.binarySearch)
		 y mostrar dicho índice por pantalla.  
		 */
		int IndiceNumero1 = Arrays.binarySearch(matriz2, matriz[0]);
		
		
		System.out.println("\nEl indice del primer numero obtenido en el apartado \"a\" es: "+IndiceNumero1);
		

	}

}
