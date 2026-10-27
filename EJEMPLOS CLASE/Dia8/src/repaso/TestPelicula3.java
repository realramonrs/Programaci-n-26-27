package repaso;

import java.time.LocalDate;

public class TestPelicula3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pelicula p1 = new Pelicula("T5678","Interestellar",LocalDate.of(2021, 9, 28));
		Pelicula p2 = new Pelicula("A3462","Parque Jurásico",LocalDate.of(1992, 10, 2));
		Pelicula p3 = new Pelicula("A3462","Parque Jurásico",LocalDate.of(1992, 10, 2));
		
		System.out.println("Hashcode: p1 " +  p1.hashCode() + " " + Integer.toHexString(p1.hashCode()));
		System.out.println("Hashcode: p2 " + p2.hashCode());
		System.out.println("Hashcode: p3 " + p3.hashCode());
		//toString por defecto (programado en la clase Object)
		System.out.println(p1.getClass() + "@" + Integer.toHexString(p1.hashCode()));
		
		System.out.println(p2);
		
		//******** equals ***********
		
		boolean igualesP1yP2 = p1.equals(p2);
		boolean igualesP2yP3 = p3.equals(p2);
		System.out.println(igualesP1yP2);
		
		
		igualesP2yP3 = p3.equals(p2);
		System.out.println(igualesP2yP3);
		
		
	}

}
