package intro; 
//Los paquetes son la estructura lógica en la que se agrupan las clases
//java.lang es el paquete por defecto, puedo utilizar sus clases
//sin necesidad de escribir ningún código adicional
//Si quiero usar clases de otros paquetes debo importarlas
import java.util.*;
import java.io.File;

public class Ejemplo1 {
	//Las clases son  los bloques básicos de construcción de código
		//Las clases están compuestas por:
		   // - Métodos (Funciones o procedimientos)
		   // - Campos , más conocidos como variables
	// Las llaves a su vez definen bloques de código
	/*
	 * Esto es un ejemplo
	 * de comentario multilinea
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo!");
		System.out.println();
		System.out.println("Me encanta JAVA!!!!");
		
		Random r = new Random(); //Paquete java.util
		File fichero; //Paquete java.io
		List<String> k;
		
	}

}
