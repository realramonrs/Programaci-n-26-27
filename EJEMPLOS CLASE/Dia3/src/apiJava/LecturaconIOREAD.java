package apiJava;

import java.io.IO;

public class LecturaconIOREAD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String codigo = IO.readln("Introduce tu código: ");
		System.out.println("Código: " + codigo);
		
		int puntos = Integer.valueOf(IO.readln("Dime tus puntos:"));
		System.out.println("Puntos: " + puntos);
	}

}
