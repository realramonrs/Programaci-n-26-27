package bucleDoWhile;

import java.io.IO;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Se suele usar para pedir info al usuario y procesarla
		
		//Programa que solicita el dni y si está incorrecto lo vuelve a solicitar
		
		String dni;
		
		do {
			dni = IO.readln("Introduzca su dni sin la letra");
			
		}
		while(dni.length()!=8);
		
		System.out.println("Muchas gracias!");
		
	}

}
