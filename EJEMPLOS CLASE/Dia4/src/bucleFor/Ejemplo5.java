package bucleFor;

import java.util.Random;

public class Ejemplo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Encontrar el primer número negativo en un array
		
		int[] numeros = new int[50];
		
		Random generador = new Random();
		
		for(int i = 0;i<numeros.length;i++) {
			numeros[i] = generador.nextInt(-10,31);
		}
		
		System.out.println("Array generado: ");
		
		for(int i = 0;i<numeros.length;i++) {
			System.out.print(numeros[i] + " ");
		}
			
		int posicion = -1;
		
		for(int i = 0;i<numeros.length;i++) {
			if(numeros[i] < 0) {
				posicion = i;
				break; //Salir del bucle antes de tiempo
			}
		
		}
		System.out.println();
		
		if(posicion>-1) {
			System.out.println("el primer número negativo está en la posición: " + posicion);
		}
		else {
			System.out.println("No hay números negativos en el array");
		}
		
	}

}
