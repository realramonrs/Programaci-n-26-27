package repasoMetodos;

public class Ejemplos {

	
	//Suma de enteros:
	public static int suma(int x, int y) {
		return x + y;
	}
	
	public static int suma(int x, int y , int z) {
		return x + y + z;
	}
	
	//Suma de enteros con parámetros opcionales
	public static int sumaMatriz(int[] n) {
		int suma = 0;
		
		for(int valor : n) {
			suma = suma + valor;
		}
		
		return suma;
	}
	
	public static int sumaOpcional(int valor, int... n) {
		//n es un array
		int numeroArgumentos = n.length;
		//int primerArgumento = n[0];
		int suma = valor;
		for(int numero : n) {
			suma = suma + numero;
		}
		
		return suma;
	}
	
}
