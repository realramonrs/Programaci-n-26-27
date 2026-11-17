package ejemploComparable;

import java.util.Arrays;

public class OrdenNaturalObjetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Criterio de ordenación para Strings
		String[] clientes = new String[4];
		
		//El criterio de ordenación de los Strings está en el método compareTo
		int criterio = clientes[0].compareTo(clientes[0]);
				
		System.out.println(criterio);
		
		
		clientes[0] = "Pedro";
		clientes[1] = "Juan";
		clientes[2] = "Sara";
		clientes[3] = "Alejandro";
		
		Arrays.sort(clientes);
		
		System.out.println(Arrays.toString(clientes));		
		
		
		
		//Criterio de ordenación para enteros
		
		int x1 = 4, x2 = 7;
		
		int criterio2 = Integer.valueOf(x1).compareTo(Integer.valueOf(x1));
		int criterio3 = Integer.compare(x1, x2);
		
		System.out.println(criterio3);
		
		int[] numeros = {4,5,6,1,2,0,10};
		
		Arrays.sort(numeros);
		
		
		
		
		
		
	}

}
