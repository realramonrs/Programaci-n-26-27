package bucleFor;

public class Ejemplo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Programa que muestra todas las posiciones en las que está un determinado
		//caracter en un String, sino lo encuentra manda un mensaje informando
		
		String cadena = "Hola Caracola";
		char caracter = 'x';
		
		System.out.println("El caracter " + caracter + " está en las posiciones: ");
		
		boolean encontrado = false;
		for(int i = 0;i<cadena.length();i++) {
			
			if(cadena.charAt(i)==caracter) {
				System.out.print(i + " ");
				encontrado = true;
			}
		}
		//aquí ya sé si lo encontré o no
		
		if(!encontrado) {
			System.out.println("No está en la cadena");
		}
		
		
	}

}
