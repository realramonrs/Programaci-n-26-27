package pruebaJar;

import java.util.Random;

public class MisMetodos {

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
		
}
