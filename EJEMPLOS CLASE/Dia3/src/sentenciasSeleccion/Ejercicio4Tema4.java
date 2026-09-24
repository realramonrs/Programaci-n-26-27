package sentenciasSeleccion;

import java.io.IO;

public class Ejercicio4Tema4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c;
		
		a = Integer.valueOf(IO.readln("Intro numero a: "));
		
		b = Integer.valueOf(IO.readln("Intro numero b: "));
		
		c = Integer.valueOf(IO.readln("Intro numero c: "));
		
		//Estrategia 1:
		
		if(a < b && a < c) {
			System.out.println("El más pequeño es : " + a);
		}
		else if(b < a && b < c) {
			System.out.println("El más pequeño es : " + b);
		}
		else {
			System.out.println("El más pequeño es : " + c);
		}
		
		//Estrategia 2:
		int menor;
		
		if(a<b) {
			menor = a;
		}
		else {
			menor = b;
		}		
		if(c < menor) {
			menor = c;
		}
		
		System.out.println("El más pequeño es : " + menor);
	
		//Estrategia 3
		
		int minimo = Math.min(Math.min(a, b),c);
		
		System.out.println("El más pequeño es : " + menor);
		
		
		
		
		
		
		
		
	}

}
