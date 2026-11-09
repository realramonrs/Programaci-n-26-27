package ejemplosRepaso;

public class Clase1 {

	//Crea un método que reciba un número int y devuelva true si ese número es perfecto
	//Un número es perfecto si la suma de sus divisores (sin contar el propio número) es igual al número. 
	//Por ejemplo : 6 es perfecto porque es igual a 1 + 2 + 3.
	
	public static boolean isPerfecto(int numero) {
		//numero = 20 ->2,4,5,10
		
		int suma = 1;
		
		for(int i = 2;i<=numero/2;i++) {
			
			if(numero % i == 0) {
				suma = suma + i;
			}
		}
		
		if(suma == numero) {
			return true;
		}
		return false;
		
	}
	
	
	public static void eliminarNegativos(int[] matriz) {
		int media = calcularMedia(matriz);
		for(int i = 0;i<matriz.length;i++) {
			if(matriz[i]<0) {
				matriz[i] = media;
			}
		}
	}


	public static int calcularMedia(int[] matriz) {
		// TODO Auto-generated method stub
		double media = 0;
		int suma = 0;
		
		for(int i = 0 ;i< matriz.length;i++) {
			suma = suma + matriz[i];
		}
		
		media = (double)suma / matriz.length;
		
		return (int)Math.ceil(media);
	}
	
}
