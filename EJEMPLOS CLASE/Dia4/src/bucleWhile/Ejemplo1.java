package bucleWhile;

import java.io.IO;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Programa que muestra por pantalla n * , siendo n un número 
		//introducido por teclado
		
		int n = Integer.valueOf(IO.readln("Introduzca el valor n: "));
		int i;
		//Bucle While -> Controlados por al menos una variable -> i, j, k
		
		//1 Inicializar variable de control
		
		i = 1;
		
		while(i<=n) {
			System.out.print("* ");
			i++;
		}
		System.out.println();
		System.out.println("Variable i = " + i);
		System.out.println("Fin del programa");
		
		
		
	}

}
