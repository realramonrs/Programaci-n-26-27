package operadores;

public class Excepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 9, m = 0;
		
		try {
			int resultado = n / m;
			System.out.println(resultado);
		}
		catch(Exception e) {
			System.out.println("No se puede realizar el cálculo, se está dividiendo por cero!");
		}
		
		System.out.println("Vuelva intentarlo!");
	}

}
