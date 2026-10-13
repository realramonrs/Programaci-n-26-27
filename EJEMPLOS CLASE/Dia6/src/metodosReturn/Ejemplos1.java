package metodosReturn;

import java.util.Random;

public class Ejemplos1 {

	
	//1. Metodo que calcula el resto de la division de 2 enteros
	
	public static int obtenerResto(int n1,int n2) {
		
		int r = n1 % n2;
		
		return r;
	}
	
	//2. Método que calcula el factorial de un número 5! = 5*4*3*2*1   , 0! = 1 , 1! = 1
	
	public static  long factorial(int n) {
		
		long fact = 1;
		int i = n;
		
		if(n<2) {
			return fact;
		}
				
		while(i>0) {
			fact = fact*i;
			i--;
		}
		return fact;				
	}
	
	//3. Método que calcula la suma de los divisores de un número
	
	public static int sumarDivisores(int n) {
		int suma = 1;
		
		for(int i = 2;i<=n;i++) {
			
			if(n % i == 0) {
			   suma = suma + i;
			}
			
		}
		
		return suma;
		
	}
	
	//4. Método que busca un número en un array y devuelve la posicion de la primera aparición de ese número
	
	public static int getPosicion(int[] matriz,int valor) {
		
		//int indice = -1;
		
		for(int i = 0;i<matriz.length;i++) {
			if(matriz[i]==valor) {
				return i;
			}
			
		}
		
		return -1;
		
	}
	
	//5. Método que genera un String aleatorio con el formato : AA99
	
	
	public static String generarClave() {
		char[] letras = {'A','B','C','D', 'E','F','G','H', 'I','J','K','L'};
		char[] numeros = {'1','2','3','4','5','6','7','8','9'};
		Random generador = new Random();
		
		char l1 = letras[generador.nextInt(letras.length)];
		char l2 = letras[generador.nextInt(letras.length)];
		char l3 = numeros[generador.nextInt(numeros.length)];
		char l4 = numeros[generador.nextInt(numeros.length)];
		
		String clave = l1 +"" + l2+""+l3+""+l4;
				
		return clave;
		
		
	}
	
	//6. Explicacion sobrecarga metodos: Ejemplos Suma
	
	public static int calcularSuma(int x,int y) {
		return x + y;
	}
	
	public static int calcularSuma(int x,int y,int z) {
		return x + y + z;
	}
	
	public static int calcularSuma(int x,int y,int z,int a) {
		return x + y + z + a;
	}
	
	
	
	
	
	
	
}
