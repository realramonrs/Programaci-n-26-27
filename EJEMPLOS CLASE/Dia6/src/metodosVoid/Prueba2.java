package metodosVoid;

public class Prueba2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 EjemplosVoid.escribir("El Celta no gana ni al ...");
		 
		 //2 Prueba método que cambia negs por cero
		 int[] a = {3,-4,5,-1,2,5};
		 
		 EjemplosVoid.cambiaNegativosPorCeros(a);
		 
		 EjemplosVoid.escribirArray(a);
		 
		 // Generar arrays
		 int[] b = new int[10];
		 EjemplosVoid.generarArray(b, 20);
		 
		 EjemplosVoid.escribirArray(b);
		 
		 int[][] c = new int[4][4];
		 
		 EjemplosVoid.generarArray(c, 1, 50);
		 EjemplosVoid.escribirArray(c);
		 
		 //Prueba métodos intercambio valores en un array
		 
		 int[] a1 = new int [10];
		 EjemplosVoid.generarArray(a1, 15);
		 EjemplosVoid.escribirArray(a1);
		 
		 EjemplosVoid.intercambiar(a1);
		 
		 EjemplosVoid.escribirArray(a1);
		 
		 EjemplosVoid.intercambiar(a1, 2, 7);
		 
		 
		 EjemplosVoid.escribirArray(a1);
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
