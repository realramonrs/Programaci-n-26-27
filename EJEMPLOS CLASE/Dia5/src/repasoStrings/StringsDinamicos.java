package repasoStrings;

public class StringsDinamicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Cuando necesitemos realizar modificaciones sobre un String
		StringBuilder cadena = new StringBuilder("Sigo siendo la misma");
		
		cadena.append(" pero ya no muero por tu querer");
		
		System.out.println(cadena);
		
		cadena.delete(0, 5);
		System.out.println(cadena);
		
		cadena.replace(0, 3, "---");
		
		cadena.setCharAt(0, 'H');
		
		System.out.println(cadena);
		
		
	}

}
