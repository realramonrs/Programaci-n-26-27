package matrices2D;

import java.util.Random;

public class Ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ejercicio en directo:
		// Crear una array de 5 filas y 5 columnas
		//Guardar valores aleatorios entre -5 y 5
		
		//Obtener los siguientes datos:
		// Valor del primer número negativo
		// Media de todos los valores generados
		// Posición del primer cero almacenado en la matriz
		// Suma de los elementos de la última columna
		
		int[][] array = new int[5][10];
		
		Random generador = new Random();
		
		for(int i = 0;i<array.length;i++) {
			for(int j = 0;j<array[i].length;j++) {
				array[i][j] = generador.nextInt( 6);
			}
		}
		System.out.println("Array generado:");
		
		//Mostrar array generado
		for(int i = 0;i<array.length;i++) {
			for(int j = 0;j<array[i].length;j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		
		// Valor del primer número negativo
		int primerValorNegativo = 0;
		boolean encontrado = false;
		
		
		
	fuera:	for(int i = 0;i<array.length;i++) {
				for(int j = 0;j<array[i].length;j++) {
		
				if(array[i][j]<0) {
					encontrado = true;
					primerValorNegativo = array[i][j];
					break fuera;
				}
				
			} // Final bucle j
			
		} // Final bucle i
		
	
	if(encontrado) {
		System.out.println("Primer número negativo: " + primerValorNegativo);
	}
	else {
		System.out.println("No hay números negativos");
	}
		// Cálculo de la media:
		
		long suma = 0;
		double media = 0;

		for(int i = 0;i<array.length;i++) {
			for(int j = 0;j<array[i].length;j++) {

				suma = suma + array[i][j];

			} // Final bucle j

		} // Final bucle i

		media = (double)suma/(array.length * array[0].length);
		
		System.out.println("La media es: " + media);
		
		
		//Obtener posición del primer cero
		int filaPrimerCero=-1 ,columnaPrimerCero = -1;
		boolean ceroEncontrado = false;
		
	fuera2:	for(int i = 0;i<array.length;i++) {
			for(int j = 0;j<array[i].length;j++) {
				if(array[i][j]==0) {
					filaPrimerCero = i;
					columnaPrimerCero = j;
					ceroEncontrado = true;
					break fuera2;
				}
			}
		}
		
		if(filaPrimerCero == -1) 
			System.out.println("No hay ceros");
		
		else 
			System.out.println("El primer cero está en la posición : [" + filaPrimerCero + "][" + columnaPrimerCero + "]");
		
		
		//Suma de elementos de la última columna
		int indiceUltimaColumna = array[0].length - 1;
		
		int sumaUltimaColumna = 0;
		
		for(int z = 0;z< array.length;z++) {
			sumaUltimaColumna+= array[z][indiceUltimaColumna];
		}
		
		System.out.println("La suma de la últuma columna es: " + sumaUltimaColumna);
		
		
		
	}

}
