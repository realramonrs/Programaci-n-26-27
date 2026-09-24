package apiJava;

import java.util.Random;

public class Aleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Tradicional ->Math.rnd
		double aleatorio = Math.random()*9 + 1;
		System.out.println(aleatorio);
		
		//Moderna -> Clase Random
		Random aleatorio2 = new Random();
		double numero = aleatorio2.nextInt(); //Numero entero cualquiera
		double numero2 = aleatorio2.nextDouble(1); // Numeros aleatorios entre 0 y 1
		double numero3 = aleatorio2.nextInt(Integer.MIN_VALUE,0); // Números aleatorios entre 1 y 10
		
		System.out.printf("Numero entero más pequeño: %,d \n" , Integer.MIN_VALUE );
		System.out.printf("Numero entero más grande: %,d \n" , Integer.MAX_VALUE);
		System.out.println("Numero : " + numero);
		System.out.println("Numero 2 : " + numero2);
		System.out.println("Numero 3: " + numero3);
		
	}

}
