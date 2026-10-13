package metodosVoid;

import java.util.Random;

public class EjemplosVoid {

	//1. Método que muestra un mensaje por consola
	
	public static void escribir(String mensaje) {
		System.out.println(mensaje);
	}
	
	//2. Métod que muestra un array por pantalla
	
	public static void escribirArray(int[] a) {
		for(int valor : a) {
			System.out.print(valor + " ");
		}
		System.out.println();
	}
	
	public static void escribirArray(int[][] a) {

		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a[i].length;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		/*for(int fila[] : a) {
			for(int valor : fila){
			System.out.print(valor + " ");
				}
			System.out.println();
			}*/
	}
	//3. Método que llena un array con valores aleatorios
	
	public static void generarArray(int[] a) {
		
		Random gen = new Random();
		
		for(int i = 0;i<a.length;i++) {
			a[i] = gen.nextInt();
		}
	}
	
	public static void generarArray(int[] a, int min, int max) {

		Random gen = new Random();

		for(int i = 0;i<a.length;i++) {
			a[i] = gen.nextInt(min,max + 1);
		}
	}
	
	public static void generarArray(int[] a,  int max) {

		Random gen = new Random();

		for(int i = 0;i<a.length;i++) {
			a[i] = gen.nextInt(max + 1);
		}
	}
	
	public static void generarArray(int[][] a, int min, int max) {

		Random gen = new Random();

		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a[i].length;j++) {
				a[i][j] = gen.nextInt(min,max + 1);
			}
		}
	}
	
	public static void generarArray(int[][] a, int max) {

		Random gen = new Random();

		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a[i].length;j++) {
				a[i][j] = gen.nextInt(max + 1);
			}
		}
	}
	
	
	//4. Método que modifica las posiciones de un array, de forma que donde había negativos pone ceros
	
	public static void cambiaNegativosPorCeros(int[] m) {
		
		for(int i = 0;i<m.length;i++) {
			if(m[i]<0) {
				m[i] = 0;
			}
		}
	}
	
	//5. Método que intercambia dos elementos de un array de 1D
	
	public static void intercambiar(int[] a) {
		//Pasa el primer valor para la última pos y el último para la primera
		
		int aux = a[0];
		a[0] = a[a.length-1];
		a[a.length - 1] = aux;
		
		
		
	}
	
	public static void intercambiar(int[] a,int pos1,int pos2) {
		//Pasa el primer valor para la última pos y el último para la primera
		
		if(pos1<a.length && pos2<a.length) {
			int aux = a[pos1];
			a[pos1] = a[pos2];
			a[pos2] = aux;
		}
		
		
	}
	
	
}
