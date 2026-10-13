package matrices2D;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Matrices 1D int[] a = new int[5]; [0,0,0,0,0]
		//a[0] = 9;
		//Matrices 2D int[][] b = new int[3][5];
		/*
		 *      0 0 0 0 0   b[0] -> Array fila 0
		 *      0 0 0 0 0   b[1] -> Array fila 1
		 *      0 0 0 0 0   b[2] -> Array fila 2
		 */
		
		//Declaración matriz 2D de 3 filas y 5 columnas
		
		int[][] b = new int[3][7];
		
		//Acceder a un elemento 
		b[0][0] = 10;
		b[1][0] = 9;
		b[2][0] = -4;
		
		//Propiedad .length -> Número de filas
		int filas = b.length;
		int columnas = b[0].length;
		int elementos = filas*columnas;
		
		// Mostrar los elementos de la fila 0
		
	for(int j = 0;j<b.length;j++) {
		
		for(int i = 0;i<b[j].length;i++) {
			System.out.print(b[j][i] + " ");
			
		}
		System.out.println();
	}			
	
	
		
		
		
	}

}
