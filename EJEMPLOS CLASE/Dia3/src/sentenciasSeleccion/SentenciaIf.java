package sentenciasSeleccion;

import java.io.IO;

public class SentenciaIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float altura = 1.85f;
		int edad = 14;
		
		//Escribir un programa que regule la entrada a la montaña rusa del parque de atracciones
		//Siguiendo las siguientes indicaciones
		//1. Pueden entrar los mayores de edad
		//2. Pueden entrar los mayores de 14 si miden más de 1.70
		//3. Si es menor de edad pero mide más de 1.80
		
		if(edad >= 18) {
		    System.out.println("Adelante, puede pasar");
		}
		else if(edad>=16 && altura >= 1.70) {
			System.out.println("Adelante, puede pasar");
		}
		else if(altura>=1.80) {
			System.out.println("Adelante, eres un gigante y puedes pasar");
		}
		else {
			System.out.println("Stop! No puedes pasar");
		}
		
		
		System.out.println("Fin del programa");
		
		
		
		//****************** EJEMPLO 2 **********************//
		//PROGRAMA QUE CALIFICA UN NÚMERO COMO PAR O IMPAR
		
		int numero = Integer.valueOf(IO.readln("Introduzca un número para saber si es par o impar:"));
		
		if(numero % 2 == 0) {
			System.out.println("Número es par");
		}
		else {
			System.out.println("Número es impar");
		}
		
		
		
		
		
	}

}
