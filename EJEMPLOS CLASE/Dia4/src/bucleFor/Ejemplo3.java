package bucleFor;

import java.util.Random;

public class Ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//3. Programa que muestra por pantalla la media de los valores de un array
		
		int[] numeros = new int[15];
		Random generador = new Random();
		
		//Llenamos el array con números aleatorios
		for(int i = 0;i<numeros.length;i++) {
			numeros[i] = generador.nextInt(1,51);
		}
		//Mostramos array generado por pantalla
		
		for(int i = 0;i<numeros.length;i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println();
		
		//Calcular la media: 
		//1º Hallar la suma
		int suma = 0;
		for(int i = 0;i<numeros.length;i++) {
			suma = suma + numeros[i];
		}
		
		//2º Dividir la suma entre el número de elementos
		
		double media = (float)suma/numeros.length;
		
		media = Math.round(media*1000.0)/1000.0;
		
		System.out.println("La suma es: " + suma);
		System.out.println("La media es : " + media);
		
		
		//Comprobación fórmula Math.round
		
		
		for(int i = 0;i<10;i++) {
			double numero = new Random().nextDouble(100);
			System.out.print(numero + " " + Math.round(numero*100.0)/100.0);
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
