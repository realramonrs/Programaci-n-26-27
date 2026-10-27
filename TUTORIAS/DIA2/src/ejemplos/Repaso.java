package ejemplos;

import java.io.IO;

public class Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//EJERCICIO 14 TEMA 3
		String[] matriz = new String[20];
		
		matriz[0] = "R Madrid";
		matriz[1] = "RC Celta";
		matriz[2] = "PSG";
		String nuevoEquipo;
		boolean formatoCorrecto ;
		//Guardar un equipo en la primera pos vacía
		do {
		 nuevoEquipo = IO.readln("Introduzca un equipo: ");
		formatoCorrecto = true;
		//Comprobar que está compuesto por al menos 3 caracteres y como máximo 20
		
		
		if(nuevoEquipo.length()<3 || nuevoEquipo.length()>20) {
			formatoCorrecto = false;
			}
		
		//Comprobar que tiene al menos un espacio
		int posicionEspacio = nuevoEquipo.indexOf(" ");
		
		if(posicionEspacio==-1) {
			formatoCorrecto = false;
			}
		
		}while(formatoCorrecto==false);
		
		if(formatoCorrecto==true) {
		
			for(int i = 0;i<matriz.length;i++) {
				if(matriz[i]==null) {
					matriz[i] = nuevoEquipo;
					break;
				}
			}
		}
		else {
			System.out.println("El formato no es correcto");
		}
		
		
		
		System.out.println("Equipos guardados actualmente: ");
		//Mostrar los equipos almacenados
		
		for(int i = 0;i<matriz.length;i++) {
			if(matriz[i]!=null) {
				System.out.println(matriz[i]);
			}
		}
		
		//Buscar equipo de fútbol
		String equipoBuscado = IO.readln("Que equipo quieres buscar");
		
		int posicionEquipoBuscado = -1;
		
		for(int i = 0;i<matriz.length;i++) {
			
			if(matriz[i].equals(equipoBuscado)) {
				posicionEquipoBuscado = i;
				break;
			}
		}
		
		if(posicionEquipoBuscado == -1) {
			System.out.println("El equipo no está en la matriz");
		}
		else {
			System.out.println(equipoBuscado + " está en la pos: " +posicionEquipoBuscado);
		}
		
		
		//Comprobar si hay una mayusculas
		String prueba = "Hala Celta";
		boolean mayuscula = false;
		
		char primerCaracter = prueba.charAt(0);
		char segundoCaracter = prueba.charAt(1);
		
		boolean mayusculaPrimerCaracter = Character.isUpperCase(primerCaracter);
		
		for(int i = 0;i<prueba.length();i++) {
			if(Character.isUpperCase(prueba.charAt(i))) {
				mayuscula = true;
				break;
			}
		}
		
		
		
		
		
		
	}

}
