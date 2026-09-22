package apiJava;

public class ClaseMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//La clase Math: 
		//sqrt(num) -> Devuelve la raiz cuadrada de num
		int num = 10;
		float raiz = (float) Math.sqrt(num);
		
		//pow(base, potencia) 
		int base = 9, potencia = 3;
		int resultado = (int) Math.pow(base, potencia);
		
		//Funciones de redondeo
		double x = 5.5;
		int enteroMenor = (int) Math.floor(x);
		int enteroMayor = (int) Math.ceil(x);
		int entero = (int) Math.round(x);
		
		System.out.println("Entero : " + entero);
		
		
	}

}
