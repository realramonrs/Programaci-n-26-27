package forMejorado;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = {-4,8,-9,0,4,2,1};
		
		System.out.println("Array generado; ");
		for(int n : numeros) {
			System.out.print(n + " ");
		}
		System.out.println();
		//Calcular la suma de los elementos
		int suma = 0;
		
		for(int valor : numeros) {
			suma = suma + valor;
		}
		
		//Búsquedas:
		int valorBuscado = 5;
		boolean encontrado = false;
		for(int valor : numeros) {
			if(valor == valorBuscado) {
				System.out.println("Encontrado!!!");
				encontrado = true;
				break;
			}
		}
		if(!encontrado) {
			System.out.println(valorBuscado + " no está en el array");
		}
		
		//No se puede usar para modificar valores
		//Algoritmo que actualiza la posición que alamacena números negativos
		//poniendola a cero.
		
		for(int valor : numeros) {
			if(valor<0) {
				valor = 0;
			}
		}
		
		System.out.println("Array con ceros en lugar de negativos; ");
		for(int valor : numeros) {
			System.out.print(valor + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
