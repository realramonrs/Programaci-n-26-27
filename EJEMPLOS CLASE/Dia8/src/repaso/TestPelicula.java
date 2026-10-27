package repaso;

import java.time.LocalDate;

public class TestPelicula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pelicula p1 = new Pelicula("A2345");
		Pelicula p2 = new Pelicula("WE3456");
		
		Pelicula p3 = new Pelicula("Q2378","Indiana Jones", LocalDate.of(1988, 9, 25));
		Pelicula p4 = new Pelicula("P0987","Tiburón",1978,6,21);
		
		p1.setId("A1244");
		System.out.println("P1:" + p1.getId());
		System.out.println("P2: " + p2.getId());
		
		p3.addValoracion(7);
		p3.addValoracion(9);
		
		p4.addValoracion(3);
		p4.addValoracion(1);
		p4.addValoracion(8);
		p4.addValoracion(5);
		p4.addValoracion(2);
		
		System.out.println(p3.getId()+ " " + p3.getTitulo() + " " + p3.getFechaEstreno() +  " val: " + p3.getValoracion());
		System.out.println(p4.getId() + " " + p4.getTitulo() + " " + p4.getFechaEstreno() +  " val: " +  p4.getValoracion());
		
		
		System.out.println("Mostrar pelis con toString:");
		System.out.println(p3);
		System.out.println(p4);
		
		
		//Acceso a parte static (shared)
		Pelicula.setProductora("NETFLIX");
		
		System.out.println("Productora de p4: " + p4.getProductora());
		
		System.out.println("Productora de p3: " + p3.getProductora());
		
		Pelicula p5 = new Pelicula("T6544");
		
		System.out.println("Productora de p5: " + p5.getProductora());
		
	}

}
