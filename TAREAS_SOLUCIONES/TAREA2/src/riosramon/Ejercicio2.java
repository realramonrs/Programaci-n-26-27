package riosramon;

import java.io.IO;
import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] letras = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		
		String palabra;
		boolean error = false;
		
		do {
			error = false;
			palabra = IO.readln("Intro palabra clave");
			
			if(palabra.length()>25) {
				error = true;
			}
		}
		
		while(error);
		
		//Una vez leida la palabra seguimos con el ejercicio
		
		int numeroLetrasAleatorias = 25 - palabra.length();
		
		char[][] matrizLetras = new char[5][5];
		
		
		//Rellenamos martizLetras
		int z = 0; //Representará índice de palabraClave
		
		 for(int i = 0;i<matrizLetras.length;i++) {
			for(int j = 0;j<matrizLetras[i].length;j++) {
				if(z<palabra.length()) {
					matrizLetras[i][j] = palabra.charAt(z);
					z++;					
				}
				else {
				//Una vez que se acabaron las letras de la palabra
				//generamos letras aleatorias
				int posicionLetras = new Random().nextInt(letras.length);
				char letraAleatoria = letras[posicionLetras];
				matrizLetras[i][j] = letraAleatoria;
				}
				
				
			}	
		
			
		}
		
		//Mostramos la martizLetras generada
		
		for(int i = 0;i<matrizLetras.length;i++) {
			for(int j = 0;j<matrizLetras[i].length;j++) {
				System.out.print(matrizLetras[i][j] + " ");
			}
			System.out.println();
			
		}
		
		//*****************  ROTACIÓN DE LA martizLetras *******************//
		// Procesar capa por capa, desde la más externa a la más interna
		
		int n = matrizLetras.length;
        for (int capa = 0; capa < n / 2; capa++) {
            int primero = capa;
            int ultimo = n - 1 - capa;

            for (int i = primero; i < ultimo; i++) {
                int offset = i - primero;

                // 1. Guardar el elemento superior temporalmente
                char temp = matrizLetras[primero][i];

                // 2. Izquierda -> Superior
                matrizLetras[primero][i] = matrizLetras[ultimo - offset][primero];

                // 3. Inferior -> Izquierda
                matrizLetras[ultimo - offset][primero] = matrizLetras[ultimo][ultimo - offset];

                // 4. Derecha -> Inferior
                matrizLetras[ultimo][ultimo - offset] = matrizLetras[i][ultimo];

                // 5. Superior (temp) -> Derecha
                matrizLetras[i][ultimo] = temp;
            }
        }
		
		//Mostramos la martizLetras rotada
		System.out.println("martizLetras rotada: ");
		
				for(int i = 0;i<matrizLetras.length;i++) {
					for(int j = 0;j<matrizLetras[i].length;j++) {
						System.out.print(matrizLetras[i][j] + " ");
						}
					System.out.println();
				}
				
		
		//Mostramos los caracteres de la diagonal principal (i = j ) 
				String cadenaFinal ="";
				System.out.println("Caracteres de la diagonal principal: ");
				for(int i = 0;i<matrizLetras.length;i++) {
					
						//	System.out.print(matrizLetras[i][i]+" ");
							cadenaFinal+= matrizLetras[i][i];
						
					}
									
				System.out.println();
				
				//Obtenemos los caracteres de la diagonal secundaria, en esta diagonal
				//el índice de columna j = n -1 - i siendo n el número de filas e i el índice
				
				int num = matrizLetras.length;
				for(int i = 0;i<matrizLetras.length;i++) {
					//System.out.print(matrizLetras[i][num - i - 1]+" ");
					cadenaFinal+= matrizLetras[i][num - i - 1];			
				}
				System.out.println();
				System.out.println("Cadena Final: " + cadenaFinal);
			
				int contadorVocales = 0;
				
				for(int i = 0;i< cadenaFinal.length();i++) {
					if(cadenaFinal.charAt(i)=='A' || cadenaFinal.charAt(i)=='E' || cadenaFinal.charAt(i)=='I' || cadenaFinal.charAt(i)=='O' 
							|| cadenaFinal.charAt(i)=='U' ) {
								
						contadorVocales++;
							}
						
						}
				
				System.out.println("Hay " + contadorVocales + " vocales");
			}
	}

	
