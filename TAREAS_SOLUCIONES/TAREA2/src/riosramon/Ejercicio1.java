package riosramon;

import java.io.IO;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] claves = new String[15];
		int numeroClaves = 0;
		//Insertamos 4 claves por código
		claves[0] = "A1234567a@";
		claves[1] = "B123456789bc#";
		claves[2] = "C1234567a@$";
		claves[3] = "D1234567a@%&6";
		
		//Presentamos un menú con bucle do - while
		int opcion;
		
		do {
			Scanner lector = new Scanner(System.in);
			System.out.println("Escoja una opción:");
			System.out.println("1. Insertar clave");
			System.out.println("2. Buscar clave");
			System.out.println("3. Analizar fortaleza");
			System.out.println("4. Mostrar claves");
			System.out.println("5. Salir");
			
			opcion = lector.nextInt();
			switch(opcion) {
			case 1:
				String clave = IO.readln("Introduzca la clave:");
				
				//Validación de la clave
				
				boolean formatoCorrecto = false;
				boolean guardada = false; // Para registrar si se pudo guardar o ya no hay espacio
				int caracteres = clave.length();
							
				//A continuación guardamos en variables booleanas las condiciones que tiene que cumplir la clave
				
				boolean numeroCaracteres = caracteres>=8 && caracteres <=16;
				
				boolean mayusculas = !clave.toLowerCase().equals(clave);				
				boolean minusculas = !clave.toUpperCase().equals(clave);
				
				//Validar que tiene un caracter especial
				boolean posArroba = clave.indexOf("@")>=0 ;
				boolean posAlmohadilla = clave.indexOf("#")>=0;
				boolean posDolar = clave.indexOf("$")>=0;
				boolean posPorcentaje = clave.indexOf("&")>=0;
									
				//Al menos una tiene que ser true
				boolean caracterEspecial = posArroba || posAlmohadilla || posDolar || posPorcentaje;
		
				//Verificar que no tiene espacios
				boolean posEspacio = clave.indexOf(" ")==-1;
				
				int posicionDigito = -1;
				
				for(int i = 0;i<clave.length();i++) {
					if(Character.isDigit(clave.charAt(i))) {
						posicionDigito = i;
						break;
					}
				}
				
				boolean posDigito = posicionDigito>=0;
				
				if(numeroCaracteres && mayusculas && minusculas && caracterEspecial && posEspacio && posDigito) {
					formatoCorrecto = true;
				}
				else {
					System.out.println("La clave introducida es errónea");
				}
				//Si el formato es correcto tratamos de guardar la clave
				if(formatoCorrecto) {
					
					//Guardamos en la primera posición vacía:
					for(int i = 0;i<claves.length;i++) {
						if(claves[i]==null) {
							claves[i] = clave;
							guardada = true;
							break;
						}
					}
					if(guardada) {
						System.out.println("Clave guardada con éxito");
					}
					else {
						System.out.println("No se ha podido guardar , la matriz está llena");
					}
				}
				
				break;
			case 2:
				String claveBuscada = IO.readln("Introduzca la clave que desea buscar:");
				boolean encontrada = false;
				int posicion = -1;
					for(int i = 0;i<claves.length;i++) {
						if(claves[i].equalsIgnoreCase(claveBuscada)) {
							encontrada = true;
							posicion = i;
							break;
						}
					}
					
					if(encontrada) {
						StringBuilder claveCifrada = new StringBuilder();

						claveCifrada.append(claveBuscada.charAt(0));

						for(int i = 1;i<claveBuscada.length()-1;i++) {
							claveCifrada.append("*");
						}
						claveCifrada.append(claveBuscada.charAt(claveBuscada.length()-1));

						System.out.println("La clave buscada está en la posición: " + posicion);
						System.out.println(claveCifrada);
					}
					else {
						System.out.println("La clave no ha sido encontrada");
					}
					
				break;
			case 3:
				
				//Calculo Indice fortaleza promedio
				//Por cada clave, asigna puntos: +1 por cada dígito, +2 por cada carácter especial, +1 si tiene más de 10 caracteres.
				int[] fortalezas = new int[claves.length];
				int indice = 0;
				
				for(String c : claves) {
					int puntos = 0;
					if(c == null) {
						break; 
					}
					if(c.length()>10) {
						puntos++;
					}
					//Contar digitos
					int contadorDigitos = 0;
					for(int i = 0;i<c.length();i++) {
						if(Character.isDigit(c.charAt(i))) {
							puntos++; //Sumamos un punto por cadadígito
							}
						if(c.charAt(i)=='#' || c.charAt(i)=='$' || c.charAt(i)=='@' || c.charAt(i)=='&') {
							puntos+=2; //Sumamos dos puntos por cada caracter especial
							}
						}
					
					//Almacenamos la puntuación en el array de puntos
					fortalezas[indice] = puntos;
					indice++; //Aumentamos el índice en uno
					} //Final del for que recorre las claves
				
				
				//Mostramos la clave junto con su fortaleza:
				
				for(int i = 0;i<claves.length;i++) {
					System.out.println(claves[i] + " - " + fortalezas[i] + " puntos.");
				}
				
				//Mostramos la clave más fuerte , para esto obtenemos la posición del array fortalezas que tiene más puntos
				
				int max = fortalezas[0];
				int posicionMax = 0;
				for(int i = 1;i<fortalezas.length;i++) {
					if(fortalezas[i]>max) {
						max = fortalezas[i];
						posicionMax = i;
					}
				}
				
				System.out.println("La clave más fuerte es: " + claves[posicionMax] + " " + fortalezas[posicionMax]);
				
				//Cálculo % de claves con más de 5 puntos
				int contadorClaves = 0;
				for(String c : claves) {
					if(c!=null) {
						contadorClaves++;
					}
					else {
						break;
					}
				}
				int contadorClaves5 = 0;
				for(int c : fortalezas) {
					if(c>5) {
						contadorClaves5++;
					}
				}
				double porcentaje = ((double)contadorClaves5/contadorClaves)*100;
				System.out.println("% de claves con fortaleza > 5: " + porcentaje + "%");
				
				break;
			case 4:
				
				for(String c : claves) {
					if(c!=null) {
						System.out.println(c);
					}
				}
				System.out.println();
				break;
			case 5:
				System.exit(0);
				break;
				default:
					break;
			}
		}while(opcion<5&&opcion>0);

	}

}
