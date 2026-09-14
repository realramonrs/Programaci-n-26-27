package ejercicios;

public class CaculoArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//A partir de la base y la altura calcular el área de un triángulo
		int base = 9, altura = 5;
		double area = (base*altura)/2;
		
		System.out.println("El area es de :" + area + " metros cuadrados");
		
		
		//A partir del radio , calcular el área de un círculo
		float radio = 5;
		double areaCirculo = Math.PI*radio*radio;
		
		System.out.println("El area es de " + areaCirculo + " metros cuadrados");
	
		//A partir de la velocidad de un vehiculo, frenarlo para que reduzca su
		//velocidad un 10%
		
				
		double velocidad = 95,velocidad2 = 95;
		velocidad = velocidad - 0.1*velocidad;
		velocidad2 = velocidad2 - (10f/100)*velocidad2;
		
		System.out.println("Velocidad tras frenada: " + velocidad);
		System.out.println("Velocidad tras frenada: " + velocidad2);
		
	
	}

}
