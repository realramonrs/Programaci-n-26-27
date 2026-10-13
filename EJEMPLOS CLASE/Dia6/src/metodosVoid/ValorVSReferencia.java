package metodosVoid;

public class ValorVSReferencia {

	//Método que le suma 10 al parametro que recibe como argumento
	public static int  sumar10(int x) {
		x = x + 10;
		return x;
	}
	
	//Método que le suma 10 al primer valor de un array
	
	public static void sumar10PosCeroArray(int[] a) {
		a[0]+=10;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c = 9;
		c = sumar10(c);
		
		System.out.println("c = " + c);
		
		int[] pepe = {3,4,5,6,7};
		sumar10PosCeroArray(pepe);
		
		EjemplosVoid.escribirArray(pepe);
		
	}

}
