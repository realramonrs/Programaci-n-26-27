package bucleFor;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2. Programa que calcula la suma de los números que hay entre n y m
		
		int n = 10;
		int m = 100;
		long suma = 0;
		
		for(int i = n;i<=m;i++) {
			suma = suma + i;
		}
		
		System.out.println("La suma es: " + suma);
		
		
	}

}
