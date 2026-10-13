package matrices2D;

import java.util.Random;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crear una matriz de 4 filas y 8 columnas
		int[][] array = new int[4][8];
		
		//Llenarlo con valores aleatorios entre 1 y 10
		Random generador = new Random();
		
		for(int i = 0;i<array.length;i++) {
			for(int j = 0;j<array[i].length;j++) {
				
				array[i][j] = generador.nextInt(1,11);
			}
		}
		
		//Mostrar la matriz generada por consola
		
		for(int i = 0;i<array.length;i++) {
			for(int j = 0;j<array[i].length;j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
