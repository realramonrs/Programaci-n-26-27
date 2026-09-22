package operadores;

public class Matematicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Operadores matemáticos + , - , * , / , %
		//Tener en cuenta que estos operadores devuelven un tipo de dato
		int e1 = 8 , e2 = 5, resultado1;
		resultado1 = e1 + e2;
		
		byte n1 = 12, n2 = 25, resultado;
		resultado = (byte)(n1 + n2); //Conversión explícita o CAST
		
		System.out.println("Resultado = " + resultado);
		
		//El operador división si los dos operandos son enteros el resultado es un entero
		int x1 = 9, x2 = 4;
		double resultado3 = (double)x1 / x2;
		System.out.println("Resultado3 = " + resultado3);
		
		//Resto de división entera
		
		byte resto = (byte) (x1 % x2);
		
		
		
	}

}
