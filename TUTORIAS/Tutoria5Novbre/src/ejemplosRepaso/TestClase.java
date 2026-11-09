package ejemplosRepaso;

import java.time.chrono.IsoChronology;

public class TestClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 28; //1,2,4,7,14   //6 = 1,2 , 3
		
		//Detectar todos los números perfectos en un rango
		int limiteInferior = 100;
		int limiteSuperior = 100000;
		
		
		for(int i = limiteInferior;i<=limiteSuperior;i++) {
			boolean perfecto = Clase1.isPerfecto(i);
			if(perfecto==true) {
				System.out.println(i + " es perfecto");
			}
			
		}
	/*	
		if(Clase1.isPerfecto(n)) {
			System.out.println(n + " es perfecto");
		}
		else {
			System.out.println(n + " no es perfecto");
		}
		*/
		
		
		int[] matriz = {4,-5,9,8,-2,9};
		
		Clase1.eliminarNegativos(matriz);
		
		for(int i = 0;i<matriz.length;i++) {
			System.out.print(matriz[i] + " ");
		}
		System.out.println();
	
	}

}
