package repasoStrings;

import java.io.IO;
import java.util.Scanner;

public class MatrizStringsEjemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Programa que almacena las matrículas de los vehiculos de un parking
		
		String[] matriculas = new String[100];
		matriculas[0] = "1234-PTY";
		matriculas[1]  = "9999-QWE";
		matriculas[2] = "0000-QAZ";
		
		//Presentar un menú con 3 opciones
		//1. Añadir matrícula
		//2. Mostrar matrículas almacenadas
		//3. Buscar matrícula
		//4. Salir
		
		
		int opcion = 0;
		
		do {
			System.out.println("Escoge una opción : ");
			System.out.println("1. Añadir matrícula");
			System.out.println("2. Mostrar matrículas");
			System.out.println("3. Buscar matrícula");
			System.out.println("4. Salir");
			
			Scanner lector = new Scanner(System.in);
			opcion = lector.nextInt();
			
			switch(opcion) {
			
			case 1:
			
				String matricula = IO.readln("Introduzca la matrícula:");
				
				//Guardar la matrícula en la primera posición vacía de la matriz
				
				for(int i = 0;i<matriculas.length;i++) {
					if(matriculas[i] == null) {
						matriculas[i] = matricula;
						break;
					}
				}					
							
				break;
			case 2:
				
				for(String m : matriculas) {
					if(m==null)
						break;
				
					System.out.println(m);
				}
				break;
			case 3:
				
				String matricula2 = IO.readln("Intro matrícula que quieres buscar");
				
				//Buscar esta matricula en la matriz
				boolean encontrado = false;
				for(String s : matriculas) {
					if(s==null) {
						break;
					}
					
					if(s.equals(matricula2)){
						encontrado = true;
						break;
					}
				}
				
				
				if (encontrado)
					System.out.println("La matrícula está en la matriz");
				else
					System.out.println("La matrícula no está en la matriz");
					
				break;
			case 4:
				System.out.println("Gracias por participar");
				break;
			default:
				System.out.println("Opción errónea");
				break;
			}
			
		}
		
		while(opcion!=4);
		
		
		
	}

}
