package sentenciasSeleccion;

import java.util.Scanner;

public class SentenciaSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Escoge una opción:");
		System.out.println("1. Saludar");
		System.out.println("2. Cantar");
		System.out.println("3. Decir adios");
		
		int opcion = new Scanner(System.in).nextInt();
		
	/*	if(opcion == 1) {
			System.out.println("Hola");
		}
		else if(opcion == 2) {
			System.out.println("Vuela vuelaaa");
		}
		*/
		
		switch(opcion) {
			
			case 1:
				System.out.println("Hola");
				break;
			case 2:
				System.out.println("Vuela vuelaaa");
				break;
				case 3:
				System.out.println("CIAOOO");
				break;
			default:
				System.out.println("Opción no válida");
			break;
				
			
		}
		
	}

}
