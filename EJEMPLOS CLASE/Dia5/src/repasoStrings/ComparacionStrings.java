package repasoStrings;

public class ComparacionStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Comparación Strings : porque usar el equals by RamonRS
		
		String cadena = "Hola";
		String cadena3 = "Hola";
		String cadena2 = new String("Hola");
		
		//Comparacion con equals
		
		boolean iguales = cadena.equals(cadena3);
		
		System.out.println("Son iguales cadena y cadena3? " + iguales);
		
		boolean igualIgual = cadena == cadena2;
		
		System.out.println("Son iguales cadena y cadena2 con == " + igualIgual);
		
	}

}
