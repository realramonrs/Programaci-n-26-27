package metodosReturn;

public class Ejemplos2 {

	
	//Método que recibe un array y devuelve todos los números negativos que contiene
	
	//  -5 , 7, -8 , 4 , 5 , 6 , 7, -1    -->
	//  -5 , -8 , -1
	// Pasos del algoritmo
	//1. Contar números negativos ok
	//2. Crear array del tamaño necesario ok
	//3. Volcar valores negativos del array original al creado ok
	//4. Retornar el array generado
	
	private static int contarNumerosNegativos(int[] a) {
		//Método que cuenta valores negs en un array
		int contador = 0;
		for(int valor:a) {
			if(valor<0) {
				contador++;
				}
			}
		return contador;
	}
	public static int[] getNumeroNegativos(int[] a) {
		int tamanho = contarNumerosNegativos(a); //Obtengo tamaño del array a partir de la cantidad de negs del original
		int[] negativos = new int[tamanho];
		
		int j = 0; //Variable que representa el indice del array negativos
		
		for(int i = 0;i<a.length;i++) {
			if(a[i]<0) {
					negativos[j] = a[i];
					j++;
				}
			}
		
		return negativos;
		
	}
	
	// Método que duplica la capacidad de un array
	
	public static int[] duplicarArray(int[] a) {
		int[] copia = new int[a.length*2];
		
		for(int i = 0;i<a.length;i++) {
			copia[i] = a[i];
		}
		
		return copia;
	}
	
	
}
