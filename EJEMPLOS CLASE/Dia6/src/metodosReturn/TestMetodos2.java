package metodosReturn;

import metodosVoid.EjemplosVoid;

public class TestMetodos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[20];
		EjemplosVoid.generarArray(a, -10, 10);
		EjemplosVoid.escribirArray(a);
		//Probar metodo que genera array de numeros negativos
		int[] negs = Ejemplos2.getNumeroNegativos(a);
		
		EjemplosVoid.escribirArray(negs);
		
		//Duplicar el tamaño de a
		a = Ejemplos2.duplicarArray(a);
		
		EjemplosVoid.escribirArray(a);
	}

}
