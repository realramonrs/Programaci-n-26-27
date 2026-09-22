package apiJava;

public class Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char car = '3';
		String frase = "Mourinho ya está llorando";
		//Podemos acceder a un caracter concret por su índice
		//Obtener el primer caracter
		char primerCaracter = frase.charAt(0);
		//Obtener el número de caracteres
		int numeroCaracteres = frase.length();
		//Obtener el último caracter
		char ultimoCaracter = frase.charAt(frase.length()-1);
		
		//Buscar caracteres
		int posicionEspacio = frase.indexOf(" ");
		int posicion2 = frase.indexOf(" ", posicionEspacio + 1);
		
		boolean encontrado = frase.contains("ya");
		
		//Comprobar si empìeza o termina por un determinado caracter
		boolean empiezaPorM = frase.startsWith("M");
		boolean terminaPorH = frase.endsWith("H");
		
		//Obtener una subcadena 
		
		String matricula = "0184-TRE";
		String matriculaNumeros = matricula.substring(0,4);
		String letrasMatricula = matricula.substring(5);
		System.out.println("Numeros de la matrícula: " + matriculaNumeros);
		
		System.out.println("Letras de la matrícula: " + letrasMatricula);
	
		//Mejorar el algoritmo anterior para que pueda obtener la parte numérico
		// y la parte alfabética independientemente de la posición del guión
		// 13241234-RTY    1-ASDF     12-WERTYUI  
		
	    String matricula2 = "1234-RTY";
	    int posicionGuion = matricula2.indexOf("-");
	    String numeros = matricula2.substring(0,posicionGuion);
	    String letras = matricula2.substring(posicionGuion + 1);
	
	    System.out.println("Numeros de la matrícula: " + numeros);
		
		System.out.println("Letras de la matrícula: " + letras);
	
		
		//split -> Permite obtener varios substrings a partir de un caracter separador
		String telefonos = "+34-654897865,+651-675309873,+97-6654342512,+302-609876543";
		
		String[] telefonosMatriz = telefonos.split(",");
	
		System.out.println(telefonosMatriz[0]);
		
		
		//Comparación de strings método equals
		String cadena1 = "Pepe";
		String cadena2 = "pepe";
		boolean iguales = cadena1.equals(cadena2);
		boolean iguales2 = cadena1.equalsIgnoreCase(cadena2);
				
		//Reemplazar caracteres: 
		String cadena11 = "Ahorcado";
		cadena11 = cadena11.replace('o','-');
	//	String cadena22 = cadena11.replace('o', '-');
		System.out.println(cadena11);
		//System.out.println(cadena22);
		
		//Trim -> Elimina espacios de los extremos
		
		String frase3 = " Me estoy jugando el poco prestigio que ya tenía ";
		frase3 = frase3.trim();
		
		System.out.println(frase3+"**");
	}

}
