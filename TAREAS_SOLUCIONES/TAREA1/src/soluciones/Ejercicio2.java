package soluciones;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaramos variable para almacenar el VIN
		String vin;
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduzca el VIN del vehículo (Recuerde 17 caracteres sin espacios");
		
		vin = lector.nextLine();
		
		System.out.println("El VIN introducido es: " + vin);
		//Apartado a) Mostrar número de caracteres introducidos:
		int contador = vin.length();
		System.out.println("Tiene : " + contador + " caracteres.");
		
		//Apartado B: Mostrar posiciones de caracteres I, O , Q , Ñ
		int posicionI= vin.indexOf("I");
		int posicionO = vin.indexOf("O");
		int posicionQ = vin.indexOf("Q");
		int posicionÑ = vin.indexOf("Ñ");
		
		System.out.println("Posición de la I: " + posicionI);
		System.out.println("Posición de la O: " + posicionO);
		System.out.println("Posición de la Q: " + posicionQ);
		System.out.println("Posición de la Ñ: " + posicionÑ);
		System.out.println();
		//Apartado C: 
		System.out.println("Apartado C: ");
		String wmi = vin.substring(0,3);
		
		String vds = vin.substring(3,9);
		
		String vis = vin.substring(9);
		
		System.out.println();
		System.out.println("WMI: " + wmi);
		System.out.println("VDS: " + vds);
		System.out.println("vis: " + vis);
		
		//Apartado D : Validación EEUU -> Empieza por 1?
		boolean empiezaPorUno = vin.startsWith("1");
		System.out.println();
		System.out.println(" Apartado D: ");
		System.out.println("Es de EEUU : " + empiezaPorUno);
		
		//Apartado E : Número producción fabricante : últimos 6 dígitos
		
		String numeroProducción = vin.substring(vin.length()-6);
		System.out.println("Numero producción: " + numeroProducción);
	}

}
