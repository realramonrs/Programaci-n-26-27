package bucleWhile;

import java.util.Arrays;
import java.util.Random;

public class Ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//3. Programa que rellena un array de 20 enteros con números aleatorios 
		// entre 1 y 15 y muestra por pantalla aquellos que son inferiores a 10
		int[] numeros = new int[20];
		
		// Llenarlo con números aleatorios
		Random generador = new Random();
		
		int i = 0;
		
		while(i<numeros.length) {
			numeros[i] = generador.nextInt(1,16);
			i++;
		}
		
		
		// Mostrar por pantalla el array generado
		
		System.out.println("Array generado: ");
	
		i = 0; //resetear variable i
		int j = 0;
		
		while(j<numeros.length) {
			System.out.print(numeros[j] + " ");
			j++;
		}
		System.out.println();
		
		System.out.println("Valores inferiores a 10:");
		
		j = 0; //puedo resetear la j si quiero volver a usarla como variable de control
		int k = 0;
		
		while(k<numeros.length) {
			if(numeros[k]<10) {
				System.out.print(numeros[k] + " ");
			}
			k++;
		}
		System.out.println();
		
		
	}

}
