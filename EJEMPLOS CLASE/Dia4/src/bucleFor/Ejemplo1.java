package bucleFor;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1 Programa que muestra todos los números entre n y m
		int n = 20;
		int m = 25;
		
		//Bucle while
		int i = n;
		
		while(i<=m) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		System.out.println("Con bucle for: ");
		//Bucle for -> for(inicio;condicion;incremento)
		
		for(int j = n;j<=m;j++) {
			System.out.print(j + " ");
		}
		
		
	}

}
