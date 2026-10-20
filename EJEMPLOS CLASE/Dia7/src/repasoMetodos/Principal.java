package repasoMetodos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 9, b = 5, c = 1;
		int resultadoSuma = Ejemplos.suma(a, b);
		int resultadoSuma3 = Ejemplos.suma(a, b, c);
		
		
		int suma4 = Ejemplos.sumaOpcional(5,4,6,7);
		int suma5 = Ejemplos.sumaOpcional(1,2,3,4,5);
		int suma2 = Ejemplos.sumaOpcional(4,9);
		int suma0 = Ejemplos.sumaOpcional(7);
		int[] valores = {4,5,6,7,8,9};
		int sumaMatriz = Ejemplos.sumaMatriz(valores);
		
		System.out.println("Suma0 = " + suma0);
		
	}

}
