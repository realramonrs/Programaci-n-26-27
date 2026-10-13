package metodosReturn;

public class TestMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero1= 9, numero2=2;
		
		int resto = Ejemplos1.obtenerResto(numero1, numero2);
		
		System.out.println("El resto es: " + resto);
		
		//Prueba del Factorial
		
		int numero3 = 10;
		//long factorial = Ejemplos1.factorial(numero3);
		System.out.println("El factorial de " + numero3 + " es: " + Ejemplos1.factorial(numero3));
		
		//Prueba método sumaDivisores
		
		int numero4 = 28;
		int sumaDiv = Ejemplos1.sumarDivisores(numero4);
		
		System.out.println("La suma de los divisores de " + numero4 + " es: " + sumaDiv);
		
		//Prueba método getPosicion: Busca un valor en un array y devuelve la posicion de la primera aparición
		
		int[] array = {9,8,5,5,3,7,2,1 };
		int numero5 = 4;
		
		int posicion = Ejemplos1.getPosicion(array, numero5);
		
		if(posicion == -1) {
			System.out.println("No se encontró el valor en el array");
		}
		else {
			System.out.println(numero5 + " está en la posición : " + posicion);
		}
		
	   // Prueba generador de claves
		
		for(int i = 0;i<10;i++){
		String clave = Ejemplos1.generarClave();
		
		System.out.println(clave);
		}
		
		//Prueba sobrecarga método suma
		
		int res1 = Ejemplos1.calcularSuma(4, 8);
		int res2 = Ejemplos1.calcularSuma(3, 6, 9);
		int res3 = Ejemplos1.calcularSuma(1, 7, 8, 9);
		
		
	}

}
