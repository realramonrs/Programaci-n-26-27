package sentenciasSeleccion;

import apiJava.CALIFICACION;

public class OperadoresLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//operadores relacionales
		
		int x = 9, y = 4;
		boolean condicion1 = x < y; //false
		
		boolean condicion2 = x!=0; //true
		
		boolean condicion3 = x == y;
		
		//Operadores lógicos
		
		boolean condicion4 = condicion1 &&  condicion2; // false porque condicion1 es false
		boolean condicion5 = condicion1 || condicion2; //true ya que condicion2 es true
		boolean condicion6 = !condicion1; //true ( Not false)
		boolean condicion7 = !condicion2; // false (Not true)
		
		
		
	}

}
