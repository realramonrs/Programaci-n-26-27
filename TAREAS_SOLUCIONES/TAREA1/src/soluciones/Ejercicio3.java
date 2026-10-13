package soluciones;

import java.io.IO;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mail = IO.readln("Introduce una dirección de mail válida: ");
		
		int posicionArroba = mail.indexOf("@");
		
		String nombreUsuario = mail.substring(0,posicionArroba);
		String dominio = mail.substring(posicionArroba + 1);
		boolean acabaEnPuntoCom = mail.endsWith(".com");
		
		int posicionPuntoDespuesArroba = mail.indexOf(".",posicionArroba);
		
		
		System.out.println("Nombre usuario: " + nombreUsuario);
		System.out.println("Dominio: " + dominio);
		System.out.println("Acaba en .com: " + acabaEnPuntoCom);
		System.out.println("Posicion @ : " + posicionArroba);
		System.out.println("Punto después arroba en posicion: " + posicionPuntoDespuesArroba);
		
	}

}
