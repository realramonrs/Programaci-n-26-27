package repaso;

import java.io.IO;
import java.util.Scanner;

public class TestPeliculaMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pelicula[] pelis = new Pelicula[10];
		
		pelis[0] = new Pelicula("Q1234","La Amenaza Fantasma", 2012,9,20);
		pelis[1] = new Pelicula("P0987","Regreso al Futuro",1985,10,4);
		pelis[2] = new Pelicula("Q1098","Solo en casa",1990,12,9);
		pelis[3] = new Pelicula("Z1010","Troya",2004,12,9);
		
		//Mostrar todas las pelis
		
		for(Pelicula p : pelis) {
			if(p!=null) {
				System.out.println(p);
			}
		}
		
		//Mostrar peliculas cuyo estreno es posterior al año 2000
		System.out.println("Peliculas estrenadas a partir del 2000: ");
		for(Pelicula p : pelis) {
			if(p!=null) {
				/*if(p.getFechaEstreno().isAfter(LocalDate.of(1999, 12, 31))) {
					System.out.println(p);
				}*/
				
				if(p.getFechaEstreno().getYear() > 2000) {
					System.out.println(p);
				}					
			}
		}
		
		
		//Menú que permita al usuario seleccionar una película para valorarla
		int indice = 0;
		int opcionSalir = 0;
		do {
		System.out.println("Escoja una pelicula: ");
		int contador = 1;
		for(Pelicula p : pelis) {
			if(p!=null) {
				System.out.println(contador +". " + p.getTitulo());
				contador++;
			}
		}
		 opcionSalir = contador;
		 
		 System.out.println(opcionSalir + ". Salir");
		
	
		Scanner lector = new Scanner(System.in);
		indice = lector.nextInt();
		
		if(indice != opcionSalir) {
			float valoracion = Float.parseFloat(IO.readln("Introduzca la valoración"));
			
			pelis[indice].addValoracion(valoracion);
			
			System.out.println("La valoración actual de la pelicula es: " + pelis[indice].getValoracion());
		}
				
		}while(indice<opcionSalir);
		
	}

}
