package apiJava;

public class Envoltorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Wrapper o envoltorios permiten añadir funcionalidades a variables primitivas
		//Variables primitivas -> int, short, char, float , double...
		//Envoltorios -> Integer, Short, Character, Float, Double , Byte , Boolean
		//Character
		
		char caracter = '5';
		
		boolean esLetra = Character.isLetter(caracter);
		boolean esDigito = Character.isDigit(caracter);
		boolean esMayuscula = Character.isUpperCase(caracter);
		boolean esMinuscula = Character.isLowerCase(caracter);
		char minuscula = 'r';
		char mayuscula = Character.toUpperCase(minuscula);
		
		//Los envoltorios numéricos se usan para pasar de variable numérica a String y viceversa
		int numero = 675432123;
		//Pasarlo a String
		String tlfn = Integer.toString(numero);
		
		String dni = "123456789";
		int dni2 = Integer.valueOf(dni);
		
		float temperatura = 34.5f;
		String temp = Float.toString(temperatura);
		
		String temperat = "56.3";
		float temp2 = Float.valueOf(temperat);
		
		System.out.println(temperat);
		
		//Ejercicio : Programa que convierte una variable de String a Float y nunca salta la excepción de NumberFormat
		
		String prueba = "56.3";
		
		
		int posicionComa = prueba.indexOf(",");
		
		if(posicionComa>=0) {
			prueba = prueba.replace(",", ".");
		}
		
		float pruebaFloat = Float.valueOf(prueba);
		
		
		System.out.println("Prueba Float: " + pruebaFloat);
		
		
		
		
	}

}
