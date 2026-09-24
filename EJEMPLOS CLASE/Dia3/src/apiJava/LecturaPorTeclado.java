package apiJava;

import java.util.Scanner;

public class LecturaPorTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector = new Scanner(System.in);
		//Solicitar al usuario código de socio
		String codigo;
		System.out.println("Introduce tu código de socio");
		codigo = lector.nextLine();
		
		System.out.println("Cçodigo intrducido: " + codigo);
		System.out.println("Introduce tu nombre de usuario: ");
		String user = lector.nextLine();
		
		System.out.println("Nombre de usuario: " + user);
		
		System.out.println("Introduzca sus puntos: ");
		int puntos = lector.nextInt();
		
		System.out.println("Puntos :" + puntos);
		
		System.out.println("introduzca la temperatura: ");
		float temp=0;
		try {
			 temp = lector.nextFloat();
		}
		catch(Exception ex) {
					
			/* Única Estrategia:
			 *  Pedir nueva temperatura (Tenemos que resetear el lector)
			*/
			System.out.println("Mete un valor con formato ###,###");
			//Vaciar el lector
			lector = new Scanner(System.in);
			temp = lector.nextFloat();
					 
		}
		
		
		System.out.println("Temperatura: " + temp);
		
}

}
