package bucleWhile;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2. Programa que muestra los números pares de un array
		int[] numeros = {3,6,8,9,2,3,7,6,5,5,2,3,4,5};
		
		int i = 0;
		int ultimoIndice = numeros.length - 1;
		
		System.out.println("Números pares: ");
		while(i<=ultimoIndice) {
			
			if(numeros[i]%2 == 0) {
				System.out.print(numeros[i] + " ");
			}
			i++;
		}
		
	}

}
