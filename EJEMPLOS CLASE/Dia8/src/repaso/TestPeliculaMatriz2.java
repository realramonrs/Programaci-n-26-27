package repaso;

import java.io.IO;
import java.util.Scanner;

public class TestPeliculaMatriz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Pelicula[] pelis = new Pelicula[10];
		
		
		int opcion = 0;
		do {	
			System.out.println("1. Introducir nueva película.");
			System.out.println("2. Ver peliculas guardadas.");
			System.out.println("3. Buscar pelicula por código.");
			Scanner lector = new Scanner(System.in);
			
			opcion = lector.nextInt();
			
			switch(opcion) {
			
			case 1:
				//Id, Titulo, Año , mes y día del estreno
				String id = IO.readln("Introduzca el id de la pelicula");
				String titulo = IO.readln("Introduzca el titulo de la película");
				int year = Integer.parseInt(IO.readln("Introduzca el año"));
				int mes = Integer.parseInt(IO.readln("Introduzca el mes"));
				int dia = Integer.parseInt(IO.readln("Introduzca el dia"));
				//Crear la pelicula en la primera pos vacía
				
				for(int i = 0;i<pelis.length;i++) {
					if(pelis[i]==null) {
						pelis[i] = new Pelicula(id,titulo,year,mes,dia);
						break;
					}
				}
				
				
				break;
			case 2:
				
				for(Pelicula p : pelis) {
					if(p!=null) {
						System.out.println(p);
					}
				}
				break;
			case 3:
				//Buscar peli por código
				String cod = IO.readln("Intro código peli");
				boolean encontrado = false;
				for(Pelicula p : pelis) {
					if(p!=null) {
						if(p.getId().equals(cod)) {
							System.out.println(p);
							encontrado = true;
							break;
						}
					}
				}
				
				if(!encontrado) {
					System.out.println("Pelicula no encontrada.");
				}
				break;
				
				default:
					System.out.println("Opción errónea");
				break;
			}
		
		}while(opcion < 4);
		
	}

}
